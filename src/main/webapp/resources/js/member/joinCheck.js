// const pass = document.getElementById("password");
// const passCheck = document.getElementById("passwordCheck");
// const pR = document.getElementById("passwordResult");
// const pcR = document.getElementById("passwordCheckResult");
// const joinBtn = document.getElementById("joinBtn");
// const req = document.getElementsByClassName("req");
// let p1 =false // password check
// let p2 =false // passwordCHeck check

//     pass.addEventListener('blur',()=>{
//         let val = pass.value;
//         if(val.length>7){
//             pR.innerHTML = 'ok';
//             p1 = true;
//         }else {
//             pR.innerHTML = '최소글자는 8 개입니다';
//             p1 = false;
//         }
        

//     })

//         passCheck.addEventListener('keyup',()=>{
  
//         if(passCheck.value == pass.value){
//            pcR.innerHTML = 'ok';  
//            p2 = true;
//         }else{
//             pcR.innerHTML = '비밀번호가 맞지않습니다';
//             p2 = false;
//         }
        
//     });

//     joinBtn.addEventListener('click',()=>{

//         for(let v of req){
//             if(v.value==null){
//                 alert('비어있습니다"');
//                 console('q');    
//             }

//         }



//         if(p2){
//             if(p1){
//                 alert('회원가입 성공');
                
//             } else{
//                 alert('비밀번호는는 8개 이상이여야합니다.');
//             }
//         }else{ 
//             alert('비밀번호가 일치하지 않습니다');
//         }
        
//     });






$('#password').blur(function(){
    if($('#password').val().length>7){
        $('#passwordResult').html('ok');
    }else {
        $('#passwordResult').html('8글자 이상');
    }

    $('#passwordCheck').val('');
    
    $('#passwordCheckResult').html('');
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