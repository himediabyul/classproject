import React from "react";
import Header from "./Header";
import MainWrap from "./MainWrap";
import Nav from "./Nav";

const header = {
        title : '블로그',
        description : 'by 리액트'
    }

const nav = {
        menus : [
            {name : 'HTML5', linkUrl : '#'},
            {name : 'Javascript', linkUrl : '#'},
            {name : 'React', linkUrl : '#'}
        ]
    }

const aside = {
        category : [
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'}
        ],
        recent : [
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'},
            {name : 'data', linkUrl: '#'}
        ]
    }

const posts = [
        {title : 'HTML5', date: '2022.12.29', imgUrl: "img/html5.png", 
        content:`메타는 서비스 장애 약 1시간 뒤인 오후 11시15분(한국시간) 공식 트위터를 통해 "일부 인스타그램 계정 접속에 문제가 있다는 것을 알고 있다. 
        원인을 파악 중이며 불편을 끼쳐 죄송하다"는 메시지를 띄웠다. 이후 다음 메시지가 올라온 건 오전 7시다. 
        "버그가 해결되었다. 이 문제가 세계 각지에서 계정 접근에 문제를 일으켰고 팔로워 수에 일시적인 변화를 일으켜 죄송하다"는 것. 
        오류 상황이 장시간 이어졌지만 복구 상황에 대한 추가 안내, 원인 공유 등은 이뤄지지 않았다. 
        차단된 계정이 아직 복구되지 않았다는 일부 사용자들의 주장도 있다. 문제가 해결됐다는 메타 측 공지 이후에도 해당 트윗에는 "내 계정이 아직 아무 이유 없이 비활성화 되어 있다", 
        "계정이 잠겼지만 인스타그램에 연락할 방법이 없다"며 인스타그램 트위터 계정을 태그하는 사용자 댓글을 다수 확인할 수 있다. 
        다만 이 같은 장시간 서비스 장애 발생에도 사용자들은 원인에 대한 구체적인 안내를 받기 어려울 전망이다. 
        메타 관계자는 "서비스 장애에 대한 원인, 시간, 영향을 받은 국가 등에 대한 데이터는 잘 공유하지 않는 편"이라고 말했다. 
        메타는 지난 10월25일에도 글로벌 메신저 '왓츠앱'에서 약 2시간 동안 서비스 장애가 발생했지만 복구 후에도 장애 원인과 규모는 밝히지 않았다.`}
    ]




function Main (props) {

    return (
        <div>
            <Header header={header}/>
            <Nav nav={nav} />
            <MainWrap
                posts={posts}
                category={aside.category}
                recent={aside.recent} />
            <footer>
                Create by bb
            </footer>
        </div>
    );
}

export default Main