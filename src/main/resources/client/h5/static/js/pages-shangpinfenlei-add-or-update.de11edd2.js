(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["pages-shangpinfenlei-add-or-update"],{"502a":function(e,t,r){"use strict";var n=r("d60b"),i=r.n(n);i.a},5148:function(e,t,r){var n=r("24fb");t=n(!1),t.push([e.i,'@charset "UTF-8";\n/**\r\n * 这里是uni-app内置的常用样式变量\r\n *\r\n * uni-app 官方扩展插件及插件市场（https://ext.dcloud.net.cn）上很多三方插件均使用了这些样式变量\r\n * 如果你是插件开发者，建议你使用scss预处理，并在插件代码中直接使用这些变量（无需 import 这个文件），方便用户通过搭积木的方式开发整体风格一致的App\r\n *\r\n */\n/**\r\n * 如果你是App开发者（插件使用者），你可以通过修改这些变量来定制自己的插件主题，实现自定义主题功能\r\n *\r\n * 如果你的项目同样使用了scss预处理，你也可以直接在你的 scss 代码中使用如下变量，同时无需 import 这个文件\r\n */\n/* 颜色变量 */\n/* 行为相关颜色 */\n/* 文字基本颜色 */\n/* 背景颜色 */\n/* 边框颜色 */\n/* 尺寸变量 */\n/* 文字尺寸 */\n/* 图片尺寸 */\n/* Border Radius */\n/* 水平间距 */\n/* 垂直间距 */\n/* 透明度 */\n/* 文章场景相关 */.content[data-v-75e8ce12]{min-height:calc(100vh - 44px);box-sizing:border-box}',""]),e.exports=t},"7c35":function(e,t,r){"use strict";r.r(t);var n=r("9612"),i=r.n(n);for(var a in n)"default"!==a&&function(e){r.d(t,e,(function(){return n[e]}))}(a);t["default"]=i.a},9612:function(e,t,r){"use strict";var n=r("4ea4");Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0,r("a481"),r("c5f6"),r("f559"),r("456d"),r("ac6a"),r("96cf");var i=n(r("3b8d")),a=n(r("e2b1")),o=n(r("064f")),s=n(r("bd56")),c={data:function(){return{cross:"",ruleForm:{shangpinfenlei:""},user:{},ro:{shangpinfenlei:!1}}},components:{wPicker:a.default,xiaEditor:o.default,multipleSelect:s.default},watch:{},onLoad:function(){var e=(0,i.default)(regeneratorRuntime.mark((function e(t){var r,n,i,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return r=uni.getStorageSync("nowTable"),e.next=3,this.$api.session(r);case 3:if(n=e.sent,this.user=n.data,this.ruleForm.userid=uni.getStorageSync("userid"),t.refid&&(this.ruleForm.refid=t.refid,this.ruleForm.nickname=uni.getStorageSync("nickname")),!t.id){e.next=13;break}return this.ruleForm.id=t.id,e.next=11,this.$api.info("shangpinfenlei",this.ruleForm.id);case 11:n=e.sent,this.ruleForm=n.data;case 13:if(this.cross=t.cross,!t.cross){e.next=25;break}i=uni.getStorageSync("crossObj"),e.t0=regeneratorRuntime.keys(i);case 17:if((e.t1=e.t0()).done){e.next=25;break}if(a=e.t1.value,"shangpinfenlei"!=a){e.next=23;break}return this.ruleForm.shangpinfenlei=i[a],this.ro.shangpinfenlei=!0,e.abrupt("continue",17);case 23:e.next=17;break;case 25:this.styleChange(),this.$forceUpdate();case 27:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}(),methods:{styleChange:function(){this.$nextTick((function(){document.querySelectorAll(".radioText").forEach((function(e){e.removeAttribute("style");var t={color:"#666666"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))})),document.querySelectorAll(".radioTextActive").forEach((function(e){e.removeAttribute("style");var t={color:"#00babd"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))})),document.querySelectorAll(".checkText").forEach((function(e){e.removeAttribute("style");var t={color:"#666666"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))})),document.querySelectorAll(".checkTextActive").forEach((function(e){e.removeAttribute("style");var t={color:"#00babd"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))})),document.querySelectorAll(".uni-radio-input").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))})),document.querySelectorAll(".uni-radio-input-checked").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #00babd",borderRadius:"100%",background:"#19d2d5"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))})),document.querySelectorAll(".uni-checkbox-input").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #999999",borderRadius:"100%",background:"#ffffff"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))})),document.querySelectorAll(".uni-checkbox-input-checked").forEach((function(e){e.removeAttribute("style");var t={border:"2rpx solid #00babd",color:"#ffffff",borderRadius:"100%",background:"#19d2d5"};Object.keys(t).forEach((function(r){e.style[r]=t[r]}))}))}))},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=(0,i.default)(regeneratorRuntime.mark((function e(){var t,r,n,i,a,o,s,c,u,l;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(!this.cross){e.next=17;break}if(uni.setStorageSync("crossCleanType",!0),a=uni.getStorageSync("statusColumnName"),o=uni.getStorageSync("statusColumnValue"),""==a){e.next=17;break}if(t||(t=uni.getStorageSync("crossObj")),a.startsWith("[")){e.next=13;break}for(s in t)s==a&&(t[s]=o);return c=uni.getStorageSync("crossTable"),e.next=11,this.$api.update("".concat(c),t);case 11:e.next=17;break;case 13:r=Number(uni.getStorageSync("userid")),n=t["id"],i=uni.getStorageSync("statusColumnName"),i=i.replace(/\[/,"").replace(/\]/,"");case 17:if(!n||!r){e.next=40;break}return this.ruleForm.crossuserid=r,this.ruleForm.crossrefid=n,u={page:1,limit:10,crossuserid:r,crossrefid:n},e.next=23,this.$api.list("shangpinfenlei",u);case 23:if(l=e.sent,!(l.data.total>=i)){e.next=30;break}return this.$utils.msg(uni.getStorageSync("tips")),uni.removeStorageSync("crossCleanType"),e.abrupt("return",!1);case 30:if(!this.ruleForm.id){e.next=35;break}return e.next=33,this.$api.update("shangpinfenlei",this.ruleForm);case 33:e.next=37;break;case 35:return e.next=37,this.$api.add("shangpinfenlei",this.ruleForm);case 37:this.$utils.msgBack("提交成功");case 38:e.next=48;break;case 40:if(!this.ruleForm.id){e.next=45;break}return e.next=43,this.$api.update("shangpinfenlei",this.ruleForm);case 43:e.next=47;break;case 45:return e.next=47,this.$api.add("shangpinfenlei",this.ruleForm);case 47:this.$utils.msgBack("提交成功");case 48:case"end":return e.stop()}}),e,this)})));function t(){return e.apply(this,arguments)}return t}(),optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var t=new Date,r=t.getFullYear(),n=t.getMonth()+1,i=t.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),n=n>9?n:"0"+n,i=i>9?i:"0"+i,"".concat(r,"-").concat(n,"-").concat(i)},toggleTab:function(e){this.$refs[e].show()}}};t.default=c},be57:function(e,t,r){"use strict";var n,i=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("v-uni-view",{staticClass:"content"},[r("v-uni-view",{style:{width:"100%",padding:"0 0 0 0",position:"relative",background:"#ffffff",height:"100%"}},[r("v-uni-form",{staticClass:"app-update-pv",style:{width:"100%",padding:"24rpx 24rpx 24rpx 24rpx",background:"#ffffff",display:"block",height:"auto"}},[r("v-uni-view",{style:{padding:"4rpx 0 4rpx 0",margin:"0 0 24rpx 0",borderColor:"#cccccc",alignItems:"center",borderRadius:"8rpx 0 0 8rpx",borderWidth:"0px",background:"#e7fefc",display:"flex",width:"100%",borderStyle:"solid",height:"auto"}},[r("v-uni-view",{staticClass:"title",style:{width:"160rpx",padding:"0 20rpx 0 0",lineHeight:"80rpx",fontSize:"28rpx",color:"#333333",textAlign:"right"}},[e._v("商品分类")]),r("v-uni-input",{style:{border:"0px solid #eeeeee",padding:"0px 24rpx 0px 24rpx",margin:"0 0 0 0",color:"#666666",borderRadius:"8rpx",flex:"1",background:"#ffffff00",fontSize:"28rpx",lineHeight:"80rpx",height:"80rpx"},attrs:{disabled:e.ro.shangpinfenlei,placeholder:"商品分类"},model:{value:e.ruleForm.shangpinfenlei,callback:function(t){e.$set(e.ruleForm,"shangpinfenlei",t)},expression:"ruleForm.shangpinfenlei"}})],1),r("v-uni-view",{staticClass:"btn",style:{width:"100%",justifyContent:"center",display:"flex",height:"auto"}},[r("v-uni-button",{staticClass:"bg-red",style:{border:"0px solid #eeeeee",padding:"0 0 0 0",boxShadow:"0px 12rpx 12rpx -12rpx #228a7f",margin:"0 4% 0 0",color:"#ffffff",borderRadius:"40rpx 0 0 0",background:"#75ebde",width:"30%",lineHeight:"80rpx",fontSize:"28rpx",height:"80rpx"},on:{click:function(t){arguments[0]=t=e.$handleEvent(t),e.onSubmitTap.apply(void 0,arguments)}}},[e._v("提交")])],1)],1)],1)],1)},a=[];r.d(t,"b",(function(){return i})),r.d(t,"c",(function(){return a})),r.d(t,"a",(function(){return n}))},d5f8:function(e,t,r){"use strict";r.r(t);var n=r("be57"),i=r("7c35");for(var a in i)"default"!==a&&function(e){r.d(t,e,(function(){return i[e]}))}(a);r("502a");var o,s=r("f0c5"),c=Object(s["a"])(i["default"],n["b"],n["c"],!1,null,"75e8ce12",null,!1,n["a"],o);t["default"]=c.exports},d60b:function(e,t,r){var n=r("5148");"string"===typeof n&&(n=[[e.i,n,""]]),n.locals&&(e.exports=n.locals);var i=r("4f06").default;i("ca02c8ac",n,!0,{sourceMap:!1,shadowMode:!1})}}]);