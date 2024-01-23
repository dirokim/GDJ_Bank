// const pass = document.getElementById("password");
// const passCheck = document.getElementById("passwordCheck");
// const pR = document.getElementById("passwordResult");
// const pcR = document.getElementById("passwordCheckResult");
// const joinBtn = document.getElementById("joinBtn");
//     pass.addEventListener('blur',()=>{
//         let val = pass.value;
//         if(val.length>7){
//             pR.innerHTML = 'ok';
//         }else {
//             pR.innerHTML = '최소글자는 8 개입니다';
//         }
//     })

//         passCheck.addEventListener('keyup',()=>{
  
//         if(passCheck.value == pass.value){
//            pcR.innerHTML = 'ok';  
//         }else{
//             pcR.innerHTML = '비밀번호가 맞지않습니다';
//         }
        
//     });

//     joinBtn.addEventListener('click',()=>{
//         if(pass.value == passCheck.value){
//             if(pass.value>7){
//                 alert("회원가입 성공");
//             } else{
//                 ("비밀번호는는 8개 이상이여야합니다.");
//             }
//         }else{ 
//             alert("비밀번호가 일치하지 않습니다");
//         }
//     });



$('#password').blur(function(){
    if($('#password').val().length>7){
        $('#passwordResult').html('ok');
    }else {
        $('#passwordResult').html('8글자 이상');
    }
})

$('#passwordCheck').keyup(function(){
    if($('#passwordCheck').val()==$('#password').val()){
        $('#passwordCheckResult').html('ok')
    }else{
        $('#passwordCheckResult').html('일치하지 않는다')
    }
})

$('#joinBtn').click(function(){
    if($('#password').val()==$('#passwordCheck').val()){
        if($('#password').val().length>7){
            alert('가입성공')
        }else {
            alert('비밀번호는 8글자 이상이여야합니다')
        }
    }else{
        alert('비밀번호가 같지않습니다');
    }
})