<template>
<view class="content">
	<view :style='{"width":"100%","flexWrap":"wrap","background":"#ffffff","display":"flex","height":"100%"}'>
		<swiper :style='{"width":"100%","background":"#ffffff","height":"360rpx"}' class="swiper" :indicator-dots='true' :autoplay='true' :circular='true' indicator-active-color='#069888' indicator-color='#06988830' :duration='500' :interval='5000' :vertical='true'>
			<swiper-item :style='{"width":"100%","background":"#ffffff","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
				<image :style='{"width":"100%","padding":"20rpx","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
				<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333333","background":"#ffffff"}'>{{ swiper.title }}</view>
			</swiper-item>
		</swiper>

		<view :style='{"minHeight":"100rpx","width":"100%","position":"relative","alignItems":"center","justifyContent":"space-between","display":"flex"}'>
			<picker v-if="queryList.length>1" mode="selector" :range="queryList" range-key="queryName" :value="queryIndex" @change="queryChange" style="padding-left: 20upx;" :style='{}'>
				<view>
					<text class="iconfont icon-gengduo2" :style='{}'></text>
				</view>
			</picker>
			<view v-if="queryIndex==0" :style='{"backgroundColor":"#f5f5f5","margin":"0 30rpx 0 30rpx","color":"#333333","alignItems":"center","borderRadius":"40rpx","flex":"1","display":"flex","lineHeight":"64rpx","fontSize":"24rpx","height":"64rpx"}'>
				<text class="iconfont icon-sousuo1" :style='{"margin":"0 16rpx 0 16rpx"}'></text>
				<input v-model="searchForm.shangpinxinxishangpinmingcheng" type="text" placeholder="商品名称" :style='{"background":"transparent","height":"100%"}'></input>
			</view>
			<button v-if="queryIndex==0" @tap="onPageTap('shangpinxinxi')" :style='{"border":"0px","padding":"0 40rpx 0 40rpx","margin":"0 20rpx 0 0px","borderRadius":"40rpx","background":"#f0f0f0","fontSize":"28rpx","lineHeight":"64rpx","height":"64rpx"}'>搜索</button>
		</view>

		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"20rpx 20rpx 20rpx 36rpx","margin":"20rpx 0 0 0","flexWrap":"wrap","background":"#ffffff","display":"flex","width":"100%","height":"auto"}'>
            <block v-for="(item,ind) in menuList" v-bind:key="item.roleName">
                <block v-if="ind==0" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
					<view v-if="menu.childs.length" :style='{"border":"2rpx solid #b4f2eb","padding":"12rpx 0 12rpx 0","margin":"10rpx 3% 20rpx 0","borderRadius":"16rpx","background":"#06988810","width":"30%","height":"auto"}' class="menu-list" @tap="menuClick(menu,index)">
						<view class="iconarr" :class="menu.fontClass" :style='{"padding":"0 0 0 0","margin":"0 auto 0 auto","color":"#333333","borderRadius":"100%","background":"none","display":"block","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","height":"64rpx"}'></view>
						<view :style='{"padding":"0 0 0 0","margin":"12rpx auto 0 auto","color":"#333333","textAlign":"center","width":"100%","lineHeight":"28rpx","fontSize":"28rpx"}'>{{menu.menu}}</view>
					</view>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
																																						<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"4"}'>
			<view v-if="true && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"padding":"0 60rpx 0 60rpx","margin":"0 0 24rpx 0","background":"url(http://codegen.caihongy.cn/20230815/6367cec65c9f4fb9bcfa04bb3d86bf4b.png) no-repeat center top / 100%  100%","display":"flex","width":"100%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"color":"#333333","fontSize":"36rpx","lineHeight":"100rpx"}'>急救课程</view>
				<text :style='{"color":"#333333","fontSize":"32rpx","lineHeight":"100rpx"}' @tap="onPageTap('jijiukecheng')">查看更多</text>
			</view>
			
			<view v-if="true && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  <!-- 样式6 -->
		  <view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
			<view v-if="homejijiukechenglist.length > 0" @tap="onDetailTap('jijiukecheng',homejijiukechenglist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[0].kechengmingcheng}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejijiukechenglist[0].fengmian.substring(0,4)=='http'" :src="homejijiukechenglist[0].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejijiukechenglist[0].fengmian?baseUrl+homejijiukechenglist[0].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[0].kechengfenlei}}</view>
			  			  			                			  			                			  			                			  			                			  			</view>
			<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homejijiukechenglist.length > 1" @tap="onDetailTap('jijiukecheng',homejijiukechenglist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[1].kechengmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejijiukechenglist[1].fengmian.substring(0,4)=='http'" :src="homejijiukechenglist[1].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejijiukechenglist[1].fengmian?baseUrl+homejijiukechenglist[1].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[1].kechengfenlei}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homejijiukechenglist.length > 2" @tap="onDetailTap('jijiukecheng',homejijiukechenglist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[2].kechengmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homejijiukechenglist[2].fengmian.substring(0,4)=='http'" :src="homejijiukechenglist[2].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejijiukechenglist[2].fengmian?baseUrl+homejijiukechenglist[2].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[2].kechengfenlei}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
			  </view>
			  <view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="homejijiukechenglist.length > 3" @tap="onDetailTap('jijiukecheng',homejijiukechenglist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[3].kechengmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-if="homejijiukechenglist[3].fengmian.substring(0,4)=='http'" :src="homejijiukechenglist[3].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"164rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejijiukechenglist[3].fengmian?baseUrl+homejijiukechenglist[3].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[3].kechengfenlei}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
				<view v-if="homejijiukechenglist.length > 4" @tap="onDetailTap('jijiukecheng',homejijiukechenglist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[4].kechengmingcheng}}</view>
				  				  				  				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejijiukechenglist[4].fengmian.substring(0,4)=='http'" :src="homejijiukechenglist[4].fengmian"></image>
				  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejijiukechenglist[4].fengmian?baseUrl+homejijiukechenglist[4].fengmian.split(',')[0]:''"></image>
				                    				  				                    				  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[4].kechengfenlei}}</view>
				  				  				                    				  				                    				  				                    				  				                    				  				</view>
			  </view>
			</view>
			<view v-if="homejijiukechenglist.length > 5" @tap="onDetailTap('jijiukecheng',homejijiukechenglist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[5].kechengmingcheng}}</view>
			  			  			  			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="homejijiukechenglist[5].fengmian.substring(0,4)=='http'" :src="homejijiukechenglist[5].fengmian"></image>
			  <image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="homejijiukechenglist[5].fengmian?baseUrl+homejijiukechenglist[5].fengmian.split(',')[0]:''"></image>
			                			  			                			  <view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis","zIndex":"1","height":"64rpx"}' class="title ">{{homejijiukechenglist[5].kechengfenlei}}</view>
			  			  			                			  			                			  			                			  			                			  			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
			<view v-if="true && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																										<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
														<view class="listBox news" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"2"}'>
			<view v-if="true && 3 == 1" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"padding":"0 60rpx 0 60rpx","margin":"0 0 0 0","background":"url(http://codegen.caihongy.cn/20230815/6367cec65c9f4fb9bcfa04bb3d86bf4b.png) no-repeat center top / 100%  100%","display":"flex","width":"100%","justifyContent":"space-between","height":"120rpx"}'>
				<view :style='{"color":"#333333","fontSize":"36rpx","lineHeight":"100rpx"}'>系统公告</view>
				<text :style='{"color":"#333333","fontSize":"32rpx","lineHeight":"100rpx"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="true && 3 == 2" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						
		  <!-- 样式4 -->
		  		  
		  <!-- 样式5 -->
		  		  
		  <!-- 样式6 -->
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  
		  <!-- 样式9 -->
		  		  <view class="news-box6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"20rpx 0 0 0","height":"auto"}'>
			<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"width":"100%","padding":"8rpx 24rpx 8rpx 80rpx","margin":"0 0 20rpx 0","position":"relative","background":"#ffffff","height":"auto"}'>
			  <view :style='{"padding":"0 0 0 0","margin":"0px 0px 0 0","borderColor":"#a1eae2","color":"#75ebde","textAlign":"center","borderRadius":"200rpx","top":"16rpx","left":"0","borderWidth":"2rpx","width":"72rpx","lineHeight":"72rpx","fontSize":"28rpx","position":"absolute","borderStyle":"solid","height":"72rpx"}' class="num">
			    <view style="width: 100%;height: 100%;position: absolute;left: 0;top: 0;" :style="{transform: 'rotate('+(-index*60)+'deg)'}" class="dian">
			      <view :style='{"transform":"translateX(-50%)","borderRadius":"100%","top":"-8rpx","left":"50%","background":"#ff0000","display":"none","width":"16rpx","position":"absolute","height":"16rpx"}'></view>
			    </view>{{ index + 1 < 10 ? '0'+(index+1) : index+1 }}
			  </view>
			  <view class="item-list-body" :style='{"width":"100%","margin":"0 0 0 20rpx","height":"auto"}'>
				<view :style='{"border":"2rpx solid #cdf6f2","padding":"0px 20rpx 0px 20rpx","margin":"0 0 24rpx 0","whiteSpace":"nowrap","color":"#333333","overflow":"hidden","borderRadius":"40rpx","background":"url(http://codegen.caihongy.cn/20230825/5482eae759f84751901c10f294c96a57.png) no-repeat center top / 100% 100%","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","textOverflow":"ellipsis","fontWeight":"600","height":"80rpx"}' class="title ">{{item.title}}</view>
				<view :style='{"padding":"4rpx 20rpx 4rpx 20rpx","overflow":"hidden","color":"#666666","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","height":"48rpx"}' class="desc ">{{item.introduction}}</view>
			  </view>
			</view>
		  </view>
		  			
			<view v-if="true && 3 == 3" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																																																		<!-- 新闻资讯 -->
				

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 3,
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				queryList:[
					{
						queryName:"商品名称",
					},
				],
				queryIndex: 0,
				searchForm:{
					shangpinxinxishangpinmingcheng:'',
				},
				CustomBar: '0',

				//轮播
				swiperList: [],
				homejijiukechenglist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            
        },
		async onShow() {
			this.swiperMenuList = []
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.user = res.data;
			this.tableName = table;
			let menus = menu.list();
			this.menuList = menus;
			let role = '管理员'
			this.menuList.forEach((item,key) => {
			    if(role==item.roleName) {
			        item.frontMenu.forEach((item2,key2) => {
						if(item2.child.length) {
							item2.childs = []
						    item2.child.forEach((item3,key3)=>{
								if(item3.buttons.indexOf("查看")>-1){
									item2.childs.push(item3)
									this.swiperMenuList.push(item3);
								}
							})
						}
			            
			        })
			    }
			})
            this.btnColor = this.btnColor.sort(()=> {
                    return (0.5-Math.random());
            });
            // let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			// 系统公告
			res = await this.$api.list('news', {
				page: 1,
				limit: 6
			});
			this.news = res.data.list


			res = await this.$api.list('jijiukecheng', {
				page: 1,

				limit: 6
			});
			this.homejijiukechenglist = res.data.list
		},

		methods: {

			//查询条件切换
			queryChange(e) {
				this.queryIndex=e.detail.value;
				this.searchForm.shangpinxinxishangpinmingcheng="";
			},
			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(tableName=='news'){
					uni.navigateTo({
						url: `../news-list/news-list`,
						fail: function(){
							uni.switchTab({
								url: `../news-list/news-list`
							});
						}
					});
					return false
				}
				if(this.queryIndex==0) {
					uni.setStorageSync('indexQueryCondition',this.searchForm.shangpinxinxishangpinmingcheng);
					this.searchForm.shangpinxinxishangpinmingcheng = '';
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
			menuClick(menu, index) {
				if (menu.childs.length > 0 && menu.childs.length == 1) {
					uni.navigateTo({
						url: `../${menu.childs[0].tableName}/list`,
						fail: function() {
							uni.switchTab({
								url: `../${menu.childs[0].tableName}/list`
							});
						}
					});
				} else if (menu.childs.length > 1) {
					let arr = []
					for(let x in menu.childs){
						arr.push(menu.childs[x].menu.length>6?menu.childs[x].menu.substring(0,6):menu.childs[x].menu)
					}
					uni.showActionSheet({
						itemList: arr,
						success: function (res) {
							uni.navigateTo({
								url: `../${menu.childs[res.tapIndex].tableName}/list`,
								fail: function() {
									uni.switchTab({
										url: `../${menu.childs[res.tapIndex].tableName}/list`
									});
								}
							});
						}
					});
				}
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
