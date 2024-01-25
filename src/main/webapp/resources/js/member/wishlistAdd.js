const btn3 = document.getElementById("btn3");

btn3.addEventListener("click",()=>{
    // fetch("/wishlist/add?productNum="+$('#productNum').val(),{
    //     method:"GET"
    // }).then(response=>{return response.text()})
    // .then(response=>{
    //     let result = response.trim();
    //     if(result==1){
    //         alert("등록 성공");
    //        if(confirm("장바구니로 가시겠습니까 ?")){
    //             location.href="/wishlist/list";
    //        }
    //     }else{
    //         alert ("등록 실패");
    //         location.href="/product/list";
    //     }
    // })

    let productNum = $('#productNum').val();
    $.ajax({
        url:"/wishlist/add",
        method:"GET",
        data:{
            productNum:productNum
        },
        success:function(result){
            let num = result.trim();
            if(num==1){
                alert('등록 성공');
                if(confirm("장바구니로 가시겠습니가?")){
                    location.href="/wishlist/list";
                }
            }else{
                alert("등록 실패");
                location.href="/product/list";
            }
        },
        error:function(){
            alert("에러!!!관리자한테 문의 ㄱ")
        }


    });


})  