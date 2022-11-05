   
   
   document.addEventListener('DOMContentLoaded', () => {

    // 문서객체 생성
    const userID = document.querySelector('#userID');
    const pw = document.querySelector('#pw');
    const repw = document.querySelector('#repw')
    const userName = document.querySelector('#userName');
    const addBtn = document.querySelector('#addBtn')
    const list = document.querySelector('#list')

       
    let cnt=0

    const addlist = () => {

        // console.log(userID.value)

        if(!(/[a-zA-Z0-9]/).test(userID.value)){
            alert('아이디는 영대소문자 와 숫자만 입력가능합니다.')
            return
        }

        if(!(/[a-zA-Z0-9]/).test(pw.value)){
            alert('패스워드는 영대소문자 와 숫자만 입력가능합니다.')
            return
        }
        
        if(repw.value !== pw.value) {
            alert('비밀번호를 확인해주세요')
            return
        }

        if(!(/[a-zA-Z가-힣]/).test(userName.value)){
            alert('이름은 영대소문자 와 한글만 입력가능합니다.')
            return
        }
        // 리스트 객체생성
        const newMem = document.createElement('tr')
        const idx = document.createElement('th')
        const uid = document.createElement('th')
        const pass = document.createElement('th')
        const uname = document.createElement('th')
        const ebtn = document.createElement('button')
        const dbtn = document.createElement('button')

        list.appendChild(newMem)

        newMem.appendChild(idx)
        newMem.appendChild(uid)
        newMem.appendChild(pass)
        newMem.appendChild(uname)
        newMem.appendChild(ebtn)
        newMem.appendChild(dbtn)

        const index = cnt++

        newMem.setAttribute('idx', index)

        idx.textContent = index
        uid.textContent = userID.value
        pass.textContent = pw.value
        uname.textContent = userName.value
        ebtn.textContent = '수정'
        dbtn.textContent = '삭제'


       
        //수정
        ebtn.addEventListener('click', (event) => {
            const editBtn = document.querySelector('#editBtn')
            editBtn.addEventListener('click',(event) =>{
            const editPw = document.querySelector('#editPw');
            const editRePw = document.querySelector('#editRePw')
            const editName = document.querySelector('#editName');
               
            if(!(/[a-zA-Z0-9]/).test(editPw.value)) {
                alert('패스워드는 영대소문자 와 숫자만 입력가능합니다.')
                return
            }
            if(editRePw.value !== editPw.value) {
                alert('비밀번호를 확인해주세요')
                return
            }
            if(!(/[a-zA-Z가-힣]/).test(editName.value)){
                alert('이름은 영대소문자 와 한글만 입력가능합니다.')
                return
            } 
            else{
                pass.textContent = editPw.value
                uname.textContent = editName.value
            }

        })

    })

        dbtn.addEventListener('click', (event) =>{
            removelist(index)
        })

        userID.value = ''
        pw.value = ''
        repw.value = ''
        userName.value = ''

    }

    // 삭제
    const removelist = (index) => {
        const delElement = document.querySelector(`tr[idx="${index}"]`)
        list.removeChild(delElement)
    }  

    addBtn.addEventListener('click', addlist)

})
 

