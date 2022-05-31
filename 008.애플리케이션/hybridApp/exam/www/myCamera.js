// 구조분해할당
const {devices} = require("cordova-android/lib/Adb");

function initCordova(){
    document.addEventListener('deviceready', onDeviceReady, true);
}

function onDeviceReady(){
    let lo = location.href;
    if(lo.indexOf("index.html") > -1) navigator.notification.alert('장치 준비됨', null, '코르도바 API');
}

// 디바이스 정보
function getDeviceInfo(){
    var msgInfo = '<p>장치 플랫폼 : ' + device.platform + '</p>'; // 플랫폼 종류
    msgInfo += '<p>OS버전 : ' + device.version + '</p>'; // 플랫폼 (예시 : 안드로이드) 버전
    msgInfo += '<p>장치uuid : ' + device.uuid + '</p>'; // 단말기 고유 식별자
    msgInfo += '<p>화면너비 : ' + screen.width + '</p>'; // 모니터 해상도 너비
    msgInfo += '<p>화면높이 : ' + screen.height + '</p>'; // 모니터 해상도 높이
    msgInfo += '<p>색상깊이 : ' + screen.colorDepth + '</p>'; // 픽셀당 색상 표현 비트수
    $("#infoArea").append(msgInfo);
}

// 사진 촬영
function takePhoto(){
    navigator.camera.getPicture(onPhotoDataSuccess, onFail,
        {
            quality: 10, destinationType: Camera.DestinationType.DATA_URL,
            sourceType: Camera.PictureSourceType.CAMERA
        });
}

// 사진촬영 성공콜백함수
function onPhotoDataSuccess(imageData) {
    $('#displayArea').attr('src', 'data:image/jpeg;base64,' + imageData);
    $('h3').replaceWith($('<h3>촬영한 사진</h3>'));
}

// 사진 촬영 검색
function getPhoto() {
    navigator.camera.getPicture(onPhotoURISuccess, onFail,
        {
            quality: 50, destinationType: Camera.DestinationType.DATA_URL,
            sourceType: Camera.PictureSourceType.PHOTOLIBRARY
        });
}

// 사진검색 성공콜백함수
function onPhotoURISuccess(imageURI){
    $('#displayArea').attr('src', 'data:image/jpeg;base64,' + imageURI);
    $('h3').replaceWith($('<h3>불러온 사진</h3>'));
}

// 사진촬영/검색 실패콜백함수
function onFail(message) {
    alert('실패 : ' + message);
}