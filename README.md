<p align="center">
  <img src="https://github.com/user-attachments/assets/cbde0ccd-cb30-487a-8442-ac502656a41f" width="500" height="150" />
</p>

<h1 align="center">프로젝트 기반 프리랜서 개발자 중개 플랫폼</h1>

<br/>

## 목차

- [1. 프로젝트 시연 영상](#-프로젝트-시연-영상)
- [2. 프로젝트 소개](#-프로젝트-소개)
- [3. 개발기간](#-개발기간)
- [4. 개발자 소개](#%EF%B8%8F-개발자-소개)
- [5. 서비스 아키텍처](#-서비스-아키텍처)
- [6. 주요 기능](#-주요-기능)
- [7. 개발 환경](#-개발-환경)
- [8. 기술 스택](#-기술-스택)
- [9. API 및 라이브러리](#%EF%B8%8F-api-및-라이브러리)
<br/>


## 🎥 프로젝트 시연 영상


[프로젝트 시연영상 링크](https://youtu.be/MDLDmTVVesE)
<br/>
[프로젝트 PPT](https://www.canva.com/design/DAGm7UhNL1Q/J-85BA3XQeJ8cKC9Ggf1mw/edit?utm_content=DAGm7UhNL1Q&utm_campaign=designshare&utm_medium=link2&utm_source=sharebutton)

<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

## 👨‍🏫 프로젝트 소개

<p align="center">
  <img src="https://github.com/user-attachments/assets/7ded3953-9e08-4db2-8c60-3afbea4bca5f" />
</p>

 프리랜서 개발자와 기업의 프로젝트를 중개하는 중개플랫폼입니다. 
 <br/>
 기업이 프로젝트를 등록하면, 프리랜서 개발자들이 자유롭게 지원하여 매칭이 이루어지며, 프리랜서의 **레벨 시스템**을 통해 개발자의 역량을 직관적으로 판단할 수 있습니다.
 <br/>
 또한, **기업 평점과 요구 기술 스택과의 적합도를 기반으로 프로젝트를 추천해주는 기능**도 제공하여 보다 효율적이고 신뢰도 높은 매칭이 가능하도록 설계되었습니다.
 
<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

## ⏱ 개발기간


- 2025.04.14 ~ 2024.05.13(1달)
- 기획서 / REST API 명세서 작성
- 발표평가

<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

## 🙋‍♂️ 개발자 소개


<table>
  <tbody>
    <tr>
     <td align="center"><a href="https://github.com/PHM-dung2"><img src="" width="100px;"  alt=""/><br /><sub><b> 박희만 </b></sub></a><br /></td>
     <td align="center"><a href="https://github.com/magnoria"><img src="" width="100px;" alt="" /><br /><sub><b> 한상범 </b></sub></a><br /></td>
     <td align="center"><a href="https://github.com/hanu1229"><img src="" width="100px;" alt=""/><br /><sub><b> 한웅제 </b></sub></a><br /></td>
     <td align="center"><a href="https://github.com/leeminjin0827"><img src="" width="100px;" alt=""/><br /><sub><b> 이민진 </b></sub></a><br /></td>
     <td align="center"><a href="https://github.com/riwon-sys"><img src="" width="100px;" alt=""/><br /><sub><b> 김리원 </b></sub></a><br /></td>
     <tr/>
  </tbody>
</table>


💡 박희만 : 조장, 공통 레이아웃 · 컴포넌트 배포, 회원(개발자) 기능, 개발자 레벨링 로직

💡 한상범 : 회원(기업)기능 , 일일 체크리스트 작성

💡 한웅재 : 프로젝트 기능 , 프로젝트 신청 기능 , GIT 관리 , AWS 배포

💡 이민진 : 기업평가 기능 , 개발자 평가 기능 , PPT(캔바) 관리

💡 김리원 : 관리자 전용 웹 어드민 전체 구현 , PPT(캔바) 관리

<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

## ⚙️ 서비스 아키텍처
![Image](https://github.com/user-attachments/assets/1c860ce5-812c-4a63-bed3-1abf7fb76aee)
<br/>

Flutter(모바일)와 React(웹) 클라이언트로부터 JWT 기반 인증·인가를 거쳐, Spring 내장 톰캣으로 구성된 마이크로서비스들이 요청을 처리하며, 토큰은 Redis에서 관리되고, 전체 인프라는 AWS EC2, RDS, S3 기반으로 운영됩니다. 

<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

## 📌 주요 기능

![Image](https://github.com/user-attachments/assets/fee241b6-8cdb-44fd-abbe-38868400e181)

- **개발자와 회사가 서로를 평가**
  - 평가 및 점수를 추가함으로써 프로젝트 선택 및 판단 가능

<br/><br/>
![Image](https://github.com/user-attachments/assets/42facaf5-ecff-40b4-8520-598e30b5d04d)
    
- **프로젝트 검색, 탐색, 매칭 추천**
  - 프로젝트 필터( 공고상태, 프론트엔드/백엔드 ) 검색
  - 프로젝트에 필요한 요구 기술스택 및 
  - 기업 평가와 기술스택 적합도에 따라 프로젝트 자동 매칭 

<br/><br/>
![Image](https://github.com/user-attachments/assets/a56a2d37-c82f-41c8-8110-76e0a8e6df84)
    
- **react 관리자 페이지에서 프로젝트 상태 확인**
  - 프로젝트 운영 흐름 관리
  - 관리자 전용 통합 제어 시스템
  - 데이터 기반 의사결정 지원

<br/><br/>
![Image](https://github.com/user-attachments/assets/bd68983d-cca7-4995-92e7-06f47c0c0e13)
 
- **회사와 개발자 각 로그인 기능 및 개발자 레벨과 랭킹 시각화**
  - 개발자 레벨과 랭킹을 통해 성장 동기부여
  - 기업의 고용시 직관적인 평가 수치 제공

<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

## 💻 개발 환경


- **Version** : Java 17.0
  
- **IDE** : <img src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellijidea&logoColor=white" alt="IntelliJ IDEA" /> <img src="https://img.shields.io/badge/Android%20Studio-3DDC84.svg?style=for-the-badge&logo=androidstudio&logoColor=white" alt="Android Studio" />&nbsp;

- **BackEnd** : <img src="https://img.shields.io/badge/Java-007396.svg?style=for-the-badge&logo=java&logoColor=white" alt="Java" /> <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring" />&nbsp;
  
- **FrontEnd** :  <img src="https://img.shields.io/badge/Flutter-02569B?style=for-the-badge&logo=flutter&logoColor=white" alt="Flutter" />&nbsp;
  
- **협업도구** : <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">

<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

## ⚒ 기술 스택


- **DataBase** : <img src="https://img.shields.io/badge/mysql-4479A1?style=for-the-badge&logo=mysql&logoColor=white"> <img src="https://img.shields.io/badge/Amazon%20RDS-527FFF.svg?style=for-the-badge&logo=amazonrds&logoColor=white" alt="Amazon RDS" />
&nbsp;
  
- **server** : 
<img src="https://img.shields.io/badge/Tomcat-10.1-F8DC75.svg?style=for-the-badge&logo=apachetomcat&logoColor=black" alt="Apache Tomcat" />&nbsp;
<img src="https://img.shields.io/badge/AWS%20EC2-FF9900.svg?style=for-the-badge&logo=amazonaws&logoColor=white" alt="AWS EC2" />&nbsp;

- **기획서 작성, 일정관리** : <img src="https://img.shields.io/badge/Excel-217346.svg?style=for-the-badge&logo=microsoft-excel&logoColor=white" alt="Microsoft Excel" /> 

<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>
<br/>
 
## ✒️ API 및 라이브러리


- **API** : <img src="https://img.shields.io/badge/RESTfulAPI-6DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white" alt="RESTful API" />

- **라이브러리** : <img src="https://img.shields.io/badge/React-61DAFB.svg?style=for-the-badge&logo=react&logoColor=black" alt="React" />&nbsp;
<img src="https://img.shields.io/badge/JJWT-ED8B00.svg?style=for-the-badge&logo=jsonwebtokens&logoColor=white" alt="JJWT" />&nbsp;
<img src="https://img.shields.io/badge/Lombok-EA3324.svg?style=for-the-badge&logo=java&logoColor=white" alt="Lombok" />&nbsp;

- [**RESTful API 명세서**](https://docs.google.com/spreadsheets/d/1Haqee1AKGxATcJow_SI67jj3wwnm8xayMNDKzFov3vU/edit?gid=1854615573#gid=1854615573)

<br/>
<div align="right">
  
  <a href="#목차"> 목차로 </a>
  
</div>

