"use strict";(self["webpackChunkmytext"]=self["webpackChunkmytext"]||[]).push([[372],{3372:function(t,e,n){n.r(e),n.d(e,{default:function(){return y}});var a=n(6768),l=n(4232);const s={class:"InventionPatentTotalBackground"},i={class:"InventionPatentTableBackground"},o=["onClick"],u={class:"InventionPatentPagination"},d={key:0,class:"InventionPatentDetailsBackground"},r={class:"InventionPatentDetailsFormBackground"},k={class:"InventionPatentDetailsForm"},c={class:"label-row"},v={class:"label-row"},h={class:"label-row"},L={class:"label-row"},m={class:"label-row"},p={class:"label-row"},b={class:"label-row"};function g(t,e,n,g,P,D){const C=(0,a.g2)("el-pagination");return(0,a.uX)(),(0,a.CE)("div",s,[(0,a.Lk)("div",i,[(0,a.Lk)("table",null,[e[1]||(e[1]=(0,a.Lk)("thead",null,[(0,a.Lk)("tr",null,[(0,a.Lk)("th",{style:{width:"2%"}},"学号"),(0,a.Lk)("th",{style:{width:"2%"}},"姓名"),(0,a.Lk)("th",{style:{width:"6%"}},"专利名称"),(0,a.Lk)("th",{style:{width:"2%"}},"专利号"),(0,a.Lk)("th",{style:{width:"2%"}},"专利申请日期"),(0,a.Lk)("th",{style:{width:"2%"}},"专利权人"),(0,a.Lk)("th",{style:{width:"2%"}},"专利授权公告日期"),(0,a.Lk)("th",{style:{width:"1%"}},"颁发部门"),(0,a.Lk)("th",{style:{width:"1%"}},"详情")])],-1)),(0,a.Lk)("tbody",null,[((0,a.uX)(!0),(0,a.CE)(a.FK,null,(0,a.pI)(P.StudentInventionPatentTable,(t=>((0,a.uX)(),(0,a.CE)("tr",{key:t.studentNumber},[(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].studentNumber),1),(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].studentName),1),(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].patentName),1),(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].patentNumber),1),(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].patentApplicationTime),1),(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].patentee),1),(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].authorizationAnnouncementDate),1),(0,a.Lk)("td",null,(0,l.v_)(t.developmentPatents[0].issuingDepartment),1),(0,a.Lk)("td",{onClick:e=>D.ViewDetails(t),class:"Details"},"查看",8,o)])))),128))])])]),(0,a.Lk)("div",u,[(0,a.bF)(C,{size:"small","page-size":P.pageSize,"pager-count":10,background:"",layout:"prev, pager, next",total:P.total,onCurrentChange:D.handlePageChange},null,8,["page-size","total","onCurrentChange"])]),P.ifDetails?((0,a.uX)(),(0,a.CE)("div",d,[(0,a.Lk)("div",r,[e[3]||(e[3]=(0,a.Lk)("span",{class:"InventionPatentDetailsFormTitle"},"软著详细信息",-1)),(0,a.Lk)("form",k,[(0,a.Lk)("div",c,[(0,a.Lk)("label",null,"姓名 : "+(0,l.v_)(P.studentDetails[0].studentName),1),(0,a.Lk)("label",null,"学号 : "+(0,l.v_)(P.studentDetails[0].studentNumber),1)]),((0,a.uX)(!0),(0,a.CE)(a.FK,null,(0,a.pI)(P.studentDetails,((t,n)=>((0,a.uX)(),(0,a.CE)("div",{key:n},[(0,a.Lk)("div",v,[(0,a.Lk)("label",null,"专利名称 : "+(0,l.v_)(t.patentName),1)]),(0,a.Lk)("div",h,[(0,a.Lk)("label",null,"专利号 : "+(0,l.v_)(t.patentNumber),1)]),(0,a.Lk)("div",L,[(0,a.Lk)("label",null,"专利申请日期 : "+(0,l.v_)(t.patentApplicationTime),1)]),(0,a.Lk)("div",m,[(0,a.Lk)("label",null,"专利权人 : "+(0,l.v_)(t.patentee),1)]),(0,a.Lk)("div",p,[(0,a.Lk)("label",null,"专利授权公告日期 : "+(0,l.v_)(t.authorizationAnnouncementDate),1)]),(0,a.Lk)("div",b,[(0,a.Lk)("label",null,"颁发部门 : "+(0,l.v_)(t.issuingDepartment),1)]),e[2]||(e[2]=(0,a.Lk)("br",null,null,-1))])))),128))]),(0,a.Lk)("button",{class:"InventionPatentDetailsFormCloseButton",onClick:e[0]||(e[0]=(...t)=>D.InventionPatentDetailsFormCloseButtonClick&&D.InventionPatentDetailsFormCloseButtonClick(...t))}," 关闭 ")])])):(0,a.Q3)("",!0)])}var P=n(6477),D={data(){return{StudentInventionPatentTable:[],ifDetails:!1,studentDetails:{},currentPage:1,pageSize:12,total:130}},mounted(){this.FetchData()},methods:{handlePageChange(t){this.currentPage=t,this.FetchData()},async FetchData(){try{const t=await P.A.get("/admin/getAcademicPerformance/getDevelopmentPatent",{params:{page:this.currentPage,pageSize:this.pageSize}});1==t.code?(this.total=t.data.total,this.StudentInventionPatentTable=t.data.records):this.$message("数据加载失败!")}catch(t){this.$message("数据加载失败!"),console.error("报错原因：",t)}},ViewDetails(t){this.RenewLabel(t),this.ifDetails=!0},RenewLabel(t){this.studentDetails=t.developmentPatents},InventionPatentDetailsFormCloseButtonClick(){this.ifDetails=!1}}},C=n(1241);const w=(0,C.A)(D,[["render",g],["__scopeId","data-v-20f882f9"]]);var y=w}}]);
//# sourceMappingURL=372.4b5d5857.js.map