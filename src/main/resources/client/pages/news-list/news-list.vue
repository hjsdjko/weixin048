<template>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback">
	<view class="content">
		<view :style='{"width":"100%","padding":"0 0 0 0","position":"relative","background":"#ffffff","height":"100%"}'>
			<view :style='{"minHeight":"100rpx","width":"100%","position":"relative","alignItems":"center","justifyContent":"space-between","display":"flex"}'>
				<view :style='{"backgroundColor":"#f5f5f5","margin":"0 30rpx 0 30rpx","color":"#333333","alignItems":"center","borderRadius":"40rpx","flex":"1","display":"flex","lineHeight":"64rpx","fontSize":"24rpx","height":"64rpx"}'>
					<text class="iconfont icon-sousuo1" :style='{"margin":"0 16rpx 0 16rpx"}'></text>
					<input v-model="searchForm.title" type="text" placeholder="标题" :style='{"background":"transparent","height":"100%"}'></input>
				</view>
				<button @tap="search" :style='{"border":"0px","padding":"0 40rpx 0 40rpx","margin":"0 20rpx 0 0px","borderRadius":"40rpx","background":"#f0f0f0","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}'>搜索</button>
			</view>





			<!-- 样式6 -->
			<view class="news-box6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto","order":"10"}'>
				<view @tap="onDetailTap(product)" v-for="(product,index) in list" :key="index" class="list-item" :style='{"width":"100%","padding":"8rpx 24rpx 8rpx 80rpx","margin":"0 0 20rpx 0","position":"relative","background":"#ffffff","height":"auto"}'>
					<view :style='{"padding":"0 0 0 0","margin":"0px 0px 0 0","borderColor":"#a1eae2","color":"#75ebde","textAlign":"center","borderRadius":"200rpx","top":"16rpx","left":"0","borderWidth":"2rpx","width":"72rpx","lineHeight":"72rpx","fontSize":"28rpx","position":"absolute","borderStyle":"solid","height":"72rpx"}' class="num">
						<view style="width: 100%;height: 100%;position: absolute;left: 0;top: 0;" :style="{transform: 'rotate('+(-index*60)+'deg)'}" class="dian">
							<view :style='{"transform":"translateX(-50%)","borderRadius":"200rpx","top":"-8rpx","left":"50%","background":"#ff0000","display":"none","width":"16rpx","position":"absolute","height":"16rpx"}' />
						</view>{{ index + 1 < 10 ? '0'+(index+1) : index+1 }}
					</view>
					<view class="item-list-body" :style='{"width":"100%","margin":"0 0 0 20rpx","height":"auto"}'>
						<view :style='{"border":"2rpx solid #cdf6f2","padding":"0px 20rpx 0px 20rpx","margin":"0 0 24rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"60rpx","background":"url(http://codegen.caihongy.cn/20230825/5482eae759f84751901c10f294c96a57.png) no-repeat center center / 100% ","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","textOverflow":"ellipsis","fontWeight":"600"}' class="title ">{{product.title}}</view>
						<view :style='{"padding":"4rpx 20rpx 4rpx 20rpx","overflow":"hidden","color":"#666666","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","height":"48rpx"}' class="desc ">{{product.introduction}}</view>
					</view>
				</view>
			</view>
		</view>
	</view>
</mescroll-uni>
</template>
<script>
	export default {
		data() {
			return {
				list:[],
				searchForm: {},
				mescroll: null, //mescroll实例对象
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onShow() {
			// 重新加载数据
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		async onLoad(options) {
            if(options.userid) {
                this.userid=options.userid;
            } else {
                this.userid = "";
            }
			// 重新加载数据
			if (this.mescroll) this.mescroll.resetUpScroll()
		},
		methods:{
			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},
			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				// 重置分页参数页数为1
				mescroll.resetUpScroll()
			},
			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
				let params = {
					page: mescroll.num,
					limit: mescroll.size
				}
				if(this.searchForm.title){
					params['title'] = '%' + this.searchForm.title + '%'
				}
				let res = {}
				if(this.userid) {
					res = await this.$api.page(`news`, params);
				} else {
					res = await this.$api.list(`news`, params);
				}
				// 如果是第一页数据置空
				if (mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				mescroll.endSuccess(mescroll.size, this.hasNext);
			},
			onDetailTap(row){
				this.$utils.jump(`../news-detail/news-detail?id=${row.id}`)
			},
			// 搜索
			async search(){
				this.mescroll.num = 1
				let searchForm = {
					page: this.mescroll.num,
					limit: this.mescroll.size
				}
				if(this.searchForm.title){
					searchForm['title'] = '%' + this.searchForm.title + '%'
				}
                let res = {};
                if(this.userid) {
                    res = await this.$api.page(`news`, searchForm);
                } else {
                    res = await this.$api.list(`news`, searchForm);
                }
				// 如果是第一页数据置空
				if (this.mescroll.num == 1) this.list = [];
				this.list = this.list.concat(res.data.list);
				let length = Math.ceil(this.list.length/6)
				let arr = [];
				for (let i = 0; i<length; i++){
					arr[i] = this.list.slice(i*6, (i+1)*6)
				}
				this.lists = arr
				if (res.data.list.length == 0) this.hasNext = false;
				this.mescroll.endSuccess(this.mescroll.size, this.hasNext);
				this.screenBoxShow = false
			}
		}
	}
</script>