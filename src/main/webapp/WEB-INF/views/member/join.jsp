<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
    <!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/head_css.jsp"></c:import>
   <title>회원가입</title>
    </head>
    <body class="d-flex flex-column h-100">
	<main class="flex-shrink-0">
		<!--사용전 경로를 꼭 수정 하세요  -->
		<c:import url="../temps/header.jsp"></c:import>


		<section class="py-5">
			<div class="text-center mb-5">
				<h1 class="display-5 fw-bolder mb-0">
					<span class="text-gradient d-inline">회원가입 </span>
				</h1>
			</div>


			<div class="row gx-5 justify-content-center">
				<div class="col-lg-11 col-xl-9 col-xxl-8">

					<form method="post" action="./join" enctype="multipart/form-data">
						<div class="mb-3">
							<label for="userName" class="form-label">I D</label> <input
								type="text" class="form-control" id="userName" name="userName"
								value="${memberDTO.userName}" placeholder="아이디를 입력하세요">
						</div>

						<div class="mb-3">
							<label for="password" class="form-label">password</label> 
							<input type="text"  class="form-control" id="password" name="password"
								placeholder="password를 입력하세요">
						</div>
						<div id="passwordResult">
							
						</div>
						<div class="mb-3">
							<label for="passwordCheck" class="form-label">passwordCheck</label>
							 <input type="text" class="form-control" id="passwordCheck" name="password"
								placeholder="password를 입력하세요">
						</div>
						<div id="passwordCheckResult">


						</div>

												<div class="mb-3">
							<label for="name" class="form-label">Name</label> <input
								type="text" 
								class="form-control" id="name" name="name"
								placeholder="name 입력하세요">
						</div>
												<div class="mb-3">
							<label for="email" class="form-label">email</label> <input
								type="text" value="${memberDTO.email}"
								class="form-control" id="email" name="email"
								placeholder="email 입력하세요">
						</div>
												<div class="mb-3">
							<label for="phone" class="form-label">phone</label> <input
								type="text" value="${memberDTO.phone}"
								class="form-control" id="phone" name="phone"
								placeholder="phone 입력하세요">
						</div>
						
						<div class="mb-3">
						
						<label for="sample6_address" class="form-label">address</label><br>
						
						<input type="text" id="sample6_postcode" placeholder="우편번호"> 
						<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br> 
						<input type="text" id="sample6_address" name="address" placeholder="address 입력하세요"><br> 
						<input type="text" id="sample6_detailAddress" placeholder="상세주소"> 
						<input type="text" id="sample6_extraAddress" placeholder="참고항목">
						
						</div>





						<div class="mb-3">
							<input class="form-control" type="file" name="attachs"> 
						</div>


						<div class="mb-3">

							<button type="button" id="joinBtn" class="btn btn-primary">회원 가입</button>
						</div>
					</form>

				</div>
			</div>












		</section>







<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
</script>

	</main>
	<!--사용전 경로를 꼭 수정 하세요  -->
	<c:import url="../temps/footer.jsp"></c:import>
	<script src="../resources/js/member/joinCheck.js" ></script>;
    </body>
</html>
