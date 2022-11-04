
document.addEventListener('DOMContentLoaded', ()=>{

    // 문서객체 생성
    const input = document.querySelector('#newTodo')
    const addBtn = document.querySelector('#addBtn')
    const todolist = document.querySelector('#todoList')

    let cnt = 0

    // 핸들러 함수
    const addTodo = ()=>{
        // console.log(input.value) // 값 확인
        if(input.value.trim()===''){ // 값이 공백이라면!
            alert('할일을 입력해주세요!')
            return
        }
        // 동적으로 추가할 엘리먼트 생성
        const newDiv = document.createElement('div')  // 할일 추가시 생성
        const checkbox = document.createElement('input')
        const todo = document.createElement('span')
        const btn = document.createElement('button')

        newDiv.appendChild(checkbox) // 할일 생성시 같이 생성되는 요소
        newDiv.appendChild(todo)
        newDiv.appendChild(btn)

        // 속성 부여
        newDiv.style.padding = '10px'

        const key = cnt++ // div가 추가될때마다 count

        newDiv.setAttribute('data-key', key)

        checkbox.type = 'checkbox'
        todo.textContent = input.value
        btn.textContent = '삭제'

        // 이벤트 적용
        // 체크박스 이벤트
        checkbox.addEventListener('change', (event)=>{
            // event.target.checked
            todo.style.textDecoration = event.target.checked? 'line-through' : '';
            // 삼항 연산자로 checkbox가 체크되면 사선긋기
        })
        // 삭제 이벤트
        btn.addEventListener('click', (event) =>{
            removeTodo(key)
        })


        // todolist에 새로운 div 추가
        todolist.appendChild(newDiv)

        input.value = '' // input란에 값 리셋
    }
        
    // 삭제 함수
    const removeTodo = function(key){
        const delElement = document.querySelector(`div[data-key="${key}"]`)
        todolist.removeChild(delElement)
    }  
    
    // 이벤트 연결
    addBtn.addEventListener('click', addTodo)
})