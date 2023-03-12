# ✏ CURL 문법 사용 Spring Boot 프로젝트
어라운드 허브 스프링 부트 기초 강의에서 학습한 내용을 curl 로 스터디


## 🕰️ 스터디 기간
• 23.03.08일 - 23.03.10일


## 🔗 강의 URL
https://www.youtube.com/watch?v=7t6tQ4KV37g&t=4325s

참고블로그 : 
https://jojoldu.tistory.com/266
https://inpa.tistory.com/entry/LINUX-%F0%9F%93%9A-CURL-%EB%AA%85%EB%A0%B9%EC%96%B4-%EC%82%AC%EC%9A%A9%EB%B2%95-%EB%8B%A4%EC%96%91%ED%95%9C-%EC%98%88%EC%A0%9C%EB%A1%9C-%EC%A0%95%EB%A6%AC

## 📌 스터디 내용
### Curl(client url) 명령어
Curl(client url) 명령어는 프로토콜들을 이용해 URL 로 데이터를 전송하여 서버에 데이터를 보내거나 가져올때 사용하기 위한 명령줄 도구 및 라이브러리이다.

쉽게말해 예를들어 자바스크립트 환경에서 REST API(http)를 테스트하고싶다면 보통 ajax, fetch 를 이용해 요청을 보내는 것과 같이, SHELL(커맨드라인 환경)에서 REST API(http) 테스트 하고 싶으면 curl 명령어를 이용하면 된다 라고 이해하면 된다.

### Curl 명령어 사용법
특정 URL을 대상으로 동작하며 URL 앞에는 curl의 옵션을 사용하면 된다.

curl 명령의 옵션은 하이픈 하나로 시작하는 short 형식과 하이픈 두개로 시작하는 long 형식을 모두 지원한다.

![image](https://user-images.githubusercontent.com/73573088/224534826-a1b5e484-2629-4e27-8a51-02161ff105cf.png)
![image](https://user-images.githubusercontent.com/73573088/224534839-1ed65541-2739-4daf-afc2-88f0f371d6e7.png)


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
