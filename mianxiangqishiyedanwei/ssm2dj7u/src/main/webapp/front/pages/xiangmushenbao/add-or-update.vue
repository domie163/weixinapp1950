<template>
	<view class="content">
		<form class="app-update-pv">
			 
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">申报主题</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shenbaozhuti" v-model="ruleForm.shenbaozhuti" placeholder="申报主题"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="shenbaotupianTap">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">申报图片</view>
				<view class="right-input" style="padding:0">
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 auto","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-if="ruleForm.shenbaotupian" :src="baseUrl+ruleForm.shenbaotupian" mode="aspectFill"></image>
					<image :style='{"padding":"0","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 auto","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","borderRadius":"100%","borderWidth":"0","width":"88rpx","borderStyle":"solid","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">申报项目</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shenbaoxiangmu" v-model="ruleForm.shenbaoxiangmu" placeholder="申报项目"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">主体</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.zhuti" v-model="ruleForm.zhuti" placeholder="主体"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">申报时间</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' v-model="ruleForm.shenbaoshijian" placeholder="申报时间" @tap="toggleTab('shenbaoshijian')"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">其他</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.qita" v-model="ruleForm.qita" placeholder="其他"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">用户账号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.yonghuzhanghao" v-model="ruleForm.yonghuzhanghao" placeholder="用户账号"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">法人</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.faren" v-model="ruleForm.faren" placeholder="法人"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">手机号</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.shoujihao" v-model="ruleForm.shoujihao" placeholder="手机号"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">企业地址</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.qiyedizhi" v-model="ruleForm.qiyedizhi" placeholder="企业地址"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","margin":"0 0 10rpx 0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">企业名称</view>
				<input :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","borderColor":"rgba(161, 161, 161, 1)","backgroundColor":"rgba(255, 255, 255, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"60rpx"}' :disabled="ro.qiyemingcheng" v-model="ruleForm.qiyemingcheng" placeholder="企业名称"></input>
			</view>
			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"104rpx"}' class="cu-form-group select">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"82rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">评审状态</view>
				<picker @change="pingshenzhuangtaiChange" :value="pingshenzhuangtaiIndex" :disabled="true" :range="pingshenzhuangtaiOptions">
					<view :style='{"padding":"0 30rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(160, 160, 160, 1)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"16rpx","borderWidth":"2rpx","width":"calc(100% - 160rpx)","lineHeight":"82rpx","fontSize":"28rpx","borderStyle":"solid"}' class="uni-input">{{ruleForm.pingshenzhuangtai?ruleForm.pingshenzhuangtai:"请选择评审状态"}}</view>
				</picker>
			</view>
			
			<!-- 否 -->
 

			<view :style='{"padding":"0 40rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderRadius":"0","borderWidth":"0","width":"100%","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0)","margin":"0","borderColor":"#ccc","backgroundColor":"rgba(0,0,0,0)","color":"rgba(160, 160, 160, 1)","textAlign":"left","borderRadius":"0","borderWidth":"0","width":"160rpx","lineHeight":"80rpx","fontSize":"28rpx","borderStyle":"solid"}' class="title">申报程序</view>
				<textarea :style='{"padding":"20rpx","boxShadow":"0 0 0px rgba(0,0,0,.6) inset","margin":"0","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(201, 201, 201, 1)","borderRadius":"16rpx","color":"rgba(160, 160, 160, 1)","borderWidth":"2rpx","width":"calc(100% - 160rpx)","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.shenbaochengxu" placeholder="申报程序"></textarea>
			</view>
			
			
			<view class="btn" >
				<button :style='{"padding":"0","boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","margin":"0","backgroundColor":"rgba(85, 89, 182, 1)","borderColor":"rgba(85, 89, 182, 1)","borderRadius":"80rpx","color":"#fff","borderWidth":"1","width":"320rpx","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="shenbaoshijianConfirm" ref="shenbaoshijian" themeColor="#333333"></w-picker>
			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				shenbaozhuti: '',
				shenbaotupian: '',
				shenbaoxiangmu: '',
				zhuti: '',
				shenbaochengxu: '',
				shenbaoshijian: '',
				qita: '',
				yonghuzhanghao: '',
				faren: '',
				shoujihao: '',
				qiyedizhi: '',
				qiyemingcheng: '',
			        pingshenzhuangtai: '待评审',
				sfsh: '',
				shhf: '',
				},
				pingshenzhuangtaiOptions: [],
				pingshenzhuangtaiIndex: 0,
				// 登陆用户信息
				user: {},
                                ro:{
                                   shenbaozhuti : false,
                                   shenbaotupian : false,
                                   shenbaoxiangmu : false,
                                   zhuti : false,
                                   shenbaochengxu : false,
                                   shenbaoshijian : false,
                                   qita : false,
                                   yonghuzhanghao : false,
                                   faren : false,
                                   shoujihao : false,
                                   qiyedizhi : false,
                                   qiyemingcheng : false,
                                   pingshenzhuangtai : false,
                                   sfsh : false,
                                   shhf : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},



		},
		async onLoad(options) {
        		this.ruleForm.shenbaoshijian = this.$utils.getCurDateTime();

			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.yonghuzhanghao = this.user.yonghuzhanghao
			this.ro.yonghuzhanghao = true;
			this.ruleForm.faren = this.user.faren
			this.ro.faren = true;
			this.ruleForm.shoujihao = this.user.shoujihao
			this.ro.shoujihao = true;

            this.ro.pingshenzhuangtai = true;

			// 自定义下拉框值
			this.pingshenzhuangtaiOptions = "已评审,待评审".split(',')

			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`xiangmushenbao`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='shenbaozhuti'){
					this.ruleForm.shenbaozhuti = obj[o];
					this.ro.shenbaozhuti = true;
					continue;
					}
					if(o=='shenbaotupian'){
					this.ruleForm.shenbaotupian = obj[o];
					this.ro.shenbaotupian = true;
					continue;
					}
					if(o=='shenbaoxiangmu'){
					this.ruleForm.shenbaoxiangmu = obj[o];
					this.ro.shenbaoxiangmu = true;
					continue;
					}
					if(o=='zhuti'){
					this.ruleForm.zhuti = obj[o];
					this.ro.zhuti = true;
					continue;
					}
					if(o=='shenbaochengxu'){
					this.ruleForm.shenbaochengxu = obj[o];
					this.ro.shenbaochengxu = true;
					continue;
					}
					if(o=='shenbaoshijian'){
					this.ruleForm.shenbaoshijian = obj[o];
					this.ro.shenbaoshijian = true;
					continue;
					}
					if(o=='qita'){
					this.ruleForm.qita = obj[o];
					this.ro.qita = true;
					continue;
					}
					if(o=='yonghuzhanghao'){
					this.ruleForm.yonghuzhanghao = obj[o];
					this.ro.yonghuzhanghao = true;
					continue;
					}
					if(o=='faren'){
					this.ruleForm.faren = obj[o];
					this.ro.faren = true;
					continue;
					}
					if(o=='shoujihao'){
					this.ruleForm.shoujihao = obj[o];
					this.ro.shoujihao = true;
					continue;
					}
					if(o=='qiyedizhi'){
					this.ruleForm.qiyedizhi = obj[o];
					this.ro.qiyedizhi = true;
					continue;
					}
					if(o=='qiyemingcheng'){
					this.ruleForm.qiyemingcheng = obj[o];
					this.ro.qiyemingcheng = true;
					continue;
					}
					if(o=='pingshenzhuangtai'){
					this.ruleForm.pingshenzhuangtai = obj[o];
					this.ro.pingshenzhuangtai = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},

			// 多级联动参数


			// 日长控件选择日期时间
			shenbaoshijianConfirm(val) {
				console.log(val)
				this.ruleForm.shenbaoshijian = val.result;
				this.$forceUpdate();
			},

			// 下拉变化
			pingshenzhuangtaiChange(e) {
				this.pingshenzhuangtaiIndex = e.target.value
				this.ruleForm.pingshenzhuangtai = this.pingshenzhuangtaiOptions[this.pingshenzhuangtaiIndex]
			},

			shenbaotupianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.shenbaotupian = 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {































//跨表计算判断
				if((!this.ruleForm.shenbaozhuti)){
					this.$utils.msg(`申报主题不能为空`);
					return
				}
				if((!this.ruleForm.qiyedizhi)){
					this.$utils.msg(`企业地址不能为空`);
					return
				}
				if((!this.ruleForm.qiyemingcheng)){
					this.$utils.msg(`企业名称不能为空`);
					return
				}
				//更新跨表属性
			       var crossuserid;
			       var crossrefid;
			       var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						var obj = uni.getStorageSync('crossObj');
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}

							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
						       crossuserid=Number(uni.getStorageSync('userid'));
						       crossrefid=obj['id'];
						       crossoptnum=uni.getStorageSync('statusColumnName');
						       crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
				}
				if(crossrefid && crossuserid) {
					this.ruleForm.crossuserid=crossuserid;
					this.ruleForm.crossrefid=crossrefid;
					let params = {
						page: 1,
						limit:10,
						crossuserid:crossuserid,
						crossrefid:crossrefid,
					}
					let res = await this.$api.list(`xiangmushenbao`, params);
					if (res.data.total >= crossoptnum) {
						this.$utils.msg(uni.getStorageSync('tips'));
						return false;
					} else {
                //跨表计算
						if(this.ruleForm.id){
							await this.$api.update(`xiangmushenbao`, this.ruleForm);
						}else{
							await this.$api.add(`xiangmushenbao`, this.ruleForm);
						}
						this.$utils.msgBack('提交成功');
					}
				} else {
                //跨表计算
					if(this.ruleForm.id){
						await this.$api.update(`xiangmushenbao`, this.ruleForm);
					}else{
						await this.$api.add(`xiangmushenbao`, this.ruleForm);
					}
					this.$utils.msgBack('提交成功');
				}
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 82rpx;
	}
	
	.select .uni-input {
		line-height: 82rpx;
	}
	
	.input .right-input {
		line-height: 60rpx;
	}
</style>
