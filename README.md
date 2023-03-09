# ✏ CURL 문법 사용 Spring Boot 프로젝트
어라운드 허브 스프링 부트 기초 강의에서 학습한 내용을 curl 로 스터디


## 🕰️ 스터디 기간
• 23.03.08일 - 


## 🔗 강의 URL
https://www.youtube.com/watch?v=7t6tQ4KV37g&t=4325s

참고블로그 : https://jojoldu.tistory.com/266

## 📌 스터디 내용
### 1. Get 방식 CURL 학습

##### Get방식에서 파라미터 없는 경우
GET localhost:7080/get-api/hello

##### Get방식에서 사용된 {변수}의 이름과 메소드의 매개변수와 일치시킨 경우
GET localhost:7080/get-api/var1/hello

##### Get방식에서 사용된 {변수}의 이름과 메소드의 매개변수와 다를 경우
GET localhost:7080/get-api/var2/hello

##### Get방식에서 '?'를 기준으로 우측에 {키} = {값}의 형태로 전달되며, 복수 형태로 전달할 경우 & 를 사용함
GET localhost:7080/get-api/request1?name=haryang&email=a@gmail.com&organization=thinkdev

##### Get방식에서 어떤 요청 값이 들어올지 모를 경우 사용하는 방식
GET localhost:7080/get-api/request2?name=haryang&email=a@gmail.com&organization=thinkdev

##### GET방식에서 key와 value가 정해져있지만, 받아야할 파라미터가 많을 경우 DTO 객체를 사용한 방식
GET localhost:7080/get-api/request3?name=haryang&email=a@gmail.com&organization=thinkdev

### 2. POST 방식으로 CURL 학습

##### POST방식에서 파라미터 없는 경우
POST localhost:7080/post-api/default

##### POST방식에서 일반적으로 추가하고자 하는 Resource를 http body에 추가하여 서버에 요청 그렇기 때문에 RequestBody를 이용하여 body에 담겨있는 값을 받아야함
POST localhost:7080/post-api/member
Content-Type: application/json

 json 파일에 넣기 전 사용
{
  "name" : "haryang",
  "email" : "a@gmail.com",
  "organization" : "abc"
}

 json 파일에 넣은 후 사용
< ./post.json

##### POST방식에서 key와 value가 정해져있지만, 받아야할 파라미터가 많을 경우 DTO객체를 사용한 방식
POST localhost:7080/post-api/member2
Content-Type: application/json

< ./post.json
