<%@ page import="ops.Notice.Beans.Notice"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"> 
	<title>공고 수정</title>
<script type="text/javascript">
	function modifyboard(){
		modifyform.submit();
	}
</script>
<style type="text/css">
input:not([type="radio"]), textarea {
 width: 50%;
  padding: 5px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  margin-top: 6px;
  margin-bottom: 16px;
  
 }
 
   h2{
      text-align: center;
   }

</style>
</head>
<body>
<h2>공고수정</h2><br>

<form action="noticeModifyPro.no" method="post" name = "modifyform">
<input type = "hidden" name = "n_no" value = "${n.n_no}"/>
	      <p align="center">
          <input name="title" placeholder="제목" type="text" id="title" value = "${n.n_title}"/>
           
          <p align="center">
          <textarea id="content" placeholder="내용" name="content" cols="68" rows="20">${n.n_content}</textarea>
          
          <p align="center">
          <input name="img" placeholder="이미지파일" type="file" id="img" value = "${n.n_img}" />
          
          <p align="center">
          <input name="comName" placeholder="기업명" type="text" id="comName" value = "${n.n_comName}" />
          
          <p align="center">
          <input name="ceoName" placeholder="대표이름" type="text" id="ceoName" value = "${n.n_ceoName}" />
          
          <p align="center">
          <input name="address" placeholder="회사주소" type="text" id="address" value = "${n.n_address}" />
          
		  <p align="center">
          <input name="job" placeholder="직종" type="text" id="job" value = "${n.n_job}" />
		  
		  <p align="center">
          <input name="reCruit" placeholder="모집인원" type="text" id="reCruit" value = "${n.n_reCruit}" />
                         
          <p align="center">
          <input name="field" placeholder="모집분야" type="text" id="field" value = "${n.n_field}" />
          
          <p align="center">
          <input name="gender" placeholder="성별" type="text" id="gender" value = "${n.n_gender}"  />
          
          <p align="center">
          <input name="age" placeholder="연령" type="text" id="age" value = "${n.n_age}" />
          
          <p align="center">
          <input name="acadamiBg" placeholder="학력" type="text" id="acadamiBg" value = "${n.n_acadamiBg }"  />
          
          <p align="center">
          <input name="sal" placeholder="급여" type="text" id="sal" value = "${n.n_sal }" />  
          
          <p align="center">
          <input name="endDate" placeholder="공고 종료일" type="text" id="endDate" value = "${n.n_endDate}"/>
          
          <p align="center">
          <input name="workTerm" placeholder="근무기간" type="text" id="workTerm" value = "${n.n_workTerm}"/>  
          
          <p align="center">
          <input name="workDay" placeholder="근무요일" type="text" id="workDay" value = "${n.n_workDay}"/>     
      
          <p align="center">
          <input name="workTime" placeholder="근무시간" type="text" id="workTime" value = "${n.n_workTime}"/>  
          
          <p align="center">
          <input name="workForm" placeholder="근무형태" type="text" id="workForm" value = "${n.n_workForm}"/>

		  <p align="center">
          <input name="name" placeholder="담당자" type="text" id="name" value = "${n.n_name}"/>
		  
		  <p align="center">
          <input name="email" placeholder="이메일" type="text" id="email" value = "${n.n_email}"/>
		  
		  <p align="center">
          <input name="phone" placeholder="연락처" type="text" id="phone"  value = "${n.n_phone}"/>
		  
		  <p align="center">
          <input name="supportForm" placeholder="지원방식" type="text" id="supportForm" value = "${n.n_supportForm}"/>
		  
		  <p align="center">
          <input name="bigo" placeholder="비고" type="text" id="bigo" value = "${n.n_bigo}"/>
		  
			<input type="submit" value="수정">
            <input type="button" value="뒤로" class="suc" onclick="javascript:window.history.back();">
	
</form>
</body>
</html>