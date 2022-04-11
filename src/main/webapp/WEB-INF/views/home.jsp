<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
      <!--<title> Responsive Sidebar Menu  | CodingLab </title>-->
    <link rel="stylesheet" href="style.css">
      <!-- Boxicons CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
 <!--src에 있는 파일을 불러와서 여기 넣고 시작하겠다!-->
    <title> 오스템 임플란트 </title>
      
    
    <style>
      @font-face {
          font-family: 'MinSans-Medium';
          src: url('https://cdn.jsdelivr.net/gh/projectnoonnu/noonfonts_2201-2@1.0/MinSans-Medium.woff') format('woff');
          font-weight: normal;
          font-style: normal;
      }


      #osstem_title{
        width : 100%;
        height : 205px;
        padding : 0.5%;
        background-color: #F58B54;
      }

      .card-body{
        background-color:  #F9F5F0;
        width : 100%;
        padding :0%;
      }
      

      #serviceInfo{
        margin: 0 auto;
        clear: both;
        border: 1px solid #F58B54;
        border-radius: 25px;
        width: 1200px;
      }

      .sidebar_mypage{
        position: fixed;
        left: 0;
        height: 100%;
        width: 250px;
        padding: 6px 14px;
        z-index: 99;
        background: #F9F5F0;
        transition: all 0.5s ease;
      }

      .links_name{
          pointer-events: auto;

          color: #321313;
          font-size: 20px;
          font-weight: 400;
          white-space: nowrap;
          pointer-events: none;
          transition: 0.4s;
      }

      .mypage-list li{
        position: relative;
        margin: 20px 0;
        list-style: none;
      }

      .mypage-list li:hover .tooltip{
          /*opacity: 1;
          transform: translateY(-50%);*/
          pointer-events: auto;
          transition: all 0.4s ease;
          top: 50%;
          background: #F9F5F0;
     }

      
      .home-section{
          position: relative;
          background: #F9F5F0;
          min-height: 100vh;
          top: 0;
          left: 250px;
          width: calc(100% - 78px);
          transition: all 0.5s ease;
          z-index: 2;
      }
            
      .home-section .text{
          display: inline-block;
          color: #321313;
          font-size: 25px;
          font-weight: 500;
          margin: 18px
      }

        
    </style>
</head>
<body>
    <div class="card">
      <div id= "osstem_title" class="card-header" style="text-align : center;">
         헤더
         <!--  <img id = "sweetdreampic" src="images\osstem_square.png" alt="ImgForPic">-->
      </div>
