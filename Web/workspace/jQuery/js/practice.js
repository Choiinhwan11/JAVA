$(function(){
  $('#join').submit(function(){
    let name = $('input[name="user_id"').val();
    if(!name){
      alert("아이디를 입력하세요.")
      $('input[name="user_id"]').focus();
      return false;
    }

    let password = $('input[name="user_password"]').val();
    if(!password){
      alert("비밀번호를 입력하세요.")
      $('input[name="user_password"]').focus();
      return false;
    }

    if(!$('input[name="gender"]').is('checked')){
      alert("성별을 체크해주세요")
      $('input[name="gender"]:eq(1)').focus();
      return false;
    }

    let email = $('input[name="email"]').val();
    if(!email){
      alert("이메일를 입력하세요.")
      $('input[name="email"]').focus();
      return false;
    }

    let url = $('input[name="url"]').val();
    if(!url){
      alert("url를 입력하세요.")
      $('input[name="url"]').focus();
      return false;
    }

    let tel = $('input[name="tel"]').val();
    if(!tel){
      alert("전화번호를 입력하세요.")
      $('input[name="tel"]').focus();
      return false;
    }

    if(!$('input[name="hobby"]').is(':checked')){
      alert("취미을 입력하세요.")
      $('input[name="hobby"]:eq(1)').attr('checked', true);
      return false;
    }

    if($('input[name="job"] > option:selected').index() == 0){
      alert("직업을 선택해주세요")
      $('input[name="job"] > option:eq(1)').attr('selected', true);
      return false;
    }

    return false;
    
  })
})