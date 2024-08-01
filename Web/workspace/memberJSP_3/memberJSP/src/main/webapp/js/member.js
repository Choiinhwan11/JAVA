var isChecked = false;
// 유효성검사
function checkWrite(){
	document.getElementById("nameDiv").innerHTML = "";
	document.getElementById("idDiv").innerHTML ="";
	document.getElementById("pwdDiv").innerHTML ="";
	document.getElementById("repwdDiv").innerHTML ="";
	
	
	if(document.getElementById("name").value == ""){
		document.getElementById("nameDiv").innerHTML = "이름을 입력하세요";
		document.getElementById("name").focus();
	}else if(document.getElementById("id").value == ""){
		document.getElementById("idDiv").innerHTML = "아이디를 입력하세요";
		document.getElementById("id").focus();
	}else if(document.getElementById("pwd").value == ""){
		document.getElementById("pwdDiv").innerHTML = "비밀번호를 입력하세요";
		document.getElementById("pwd").focus();
	}else if(document.getElementById("pwd").value != document.getElementById("repwd").value){
		document.getElementById("repwdDiv").innerHTML = "비밀번호가 일치하지 않습니다";
		document.getElementById("repwd").focus();
	}else if(document.getElementById("id").value != document.getElementById("check").value){
		alert("중복체크 하세요");
	}else {
		document.getElementById("form1").submit();
	}
}

//이메일
function onChangeEmail(){
	if(document.getElementById("email3").value == "직접입력"){
		document.getElementById("email2").value = '';
		document.getElementById("email2").focus();
	} else {
		document.getElementById("email2").value = document.getElementById("email3").value;
	}
}

// 이메일
function change(){
	
	document.getElementById("email2").value = document.getElementById("email3").value;
}

// 회원정보수정
function checkUpdate(){
	document.getElementById("nameDiv").innerHTML = "";
	document.getElementById("pwdDiv").innerHTML ="";
	document.getElementById("repwdDiv").innerHTML ="";
	
	
	if(document.getElementById("name").value == ""){
		document.getElementById("nameDiv").innerHTML = "이름을 입력하세요";
		document.getElementById("name").focus();
	}else if(document.getElementById("pwd").value == ""){
		document.getElementById("pwdDiv").innerHTML = "비밀번호를 입력하세요";
		document.getElementById("pwd").focus();
	}else if(document.getElementById("pwd").value != document.getElementById("repwd").value){
		document.getElementById("repwdDiv").innerHTML = "비밀번호가 일치하지 않습니다";
		document.getElementById("repwd").focus();
	}else {
		document.getElementById("updateForm").submit();
		
	}
}



// 우편번호
function checkPost(){
	new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }
                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('zipcode').value = data.zonecode;
                document.getElementById("addr1").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("addr2").focus();
            }
        }).open();
}
// 아이디중복확인
function checkId(){
	var id = document.getElementById("id").value
	if(id == ""){
		alert("먼저 아이디를 입력하세요");
	}else{
		// window.open(파일,이름,속성)
		// 같은 이름으로 여러창 열리지 않는다.
		// URL?변수=값 : 형식으로 URL에 데이터 실어보낼수있다. (Get방식)
		var checkIdWindow = window.open("checkId.jsp?id=" + id  
					,"checkId"
					,"width=450 height=150 left=300 top=150");
		
		
	}
}

//로그인
function checkLogin(){
	document.getElementById("idDiv").innerHTML ="";
	document.getElementById("pwdDiv").innerHTML ="";
	if(document.getElementById("id").value == ""){
		document.getElementById("idDiv").innerHTML = "아이디를 입력하세요";
		document.getElementById("id").focus();
	}else if(document.getElementById("pwd").value == ""){
		document.getElementById("pwdDiv").innerHTML = "비밀번호를 입력하세요";
		document.getElementById("pwd").focus();
	}else{
		document.getElementById("loginForm").submit();
	}
}
/*
function openWriteForm(){
	var checkIdWindow = window.open("http://localhost:8080/memberJSP/member/writeForm.jsp"  
					,"writeForm"
					,"width=600 height=600 left=300 top=150");
}
*/
function checkBoardWrite(){
	document.getElementById("subjectDiv").innerHTML ="";
	if(document.getElementById("subject").value == ""){
		document.getElementById("subjectDiv").innerHTML = "제목을 입력하세요";
		document.getElementById("subject").focus();
	}
	else if(document.getElementById("content").value == ""){
		document.getElementById("contentDiv").innerHTML = "내용을 입력하세요";
		document.getElementById("content").focus();
	}
	else{
		document.boardWriteForm.submit();
	}
}
function checkGuestbookWrite(){
	document.getElementById("contentDiv").innerHTML ="";
	document.getElementById("subjectDiv").innerHTML ="";
	if(document.getElementById("subject").value == ""){
		document.getElementById("subjectDiv").innerHTML = "제목을 입력하세요";
		document.getElementById("subject").focus();
	}
	else if(document.getElementById("content").value == ""){
		document.getElementById("contentDiv").innerHTML = "내용을 입력하세요";
		document.getElementById("content").focus();
	}
	else{
		document.guestbookWriteForm.submit();
	}
}