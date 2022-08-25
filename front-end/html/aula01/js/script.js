let lnome = document.querySelectorAll("label")[0]
let lemail = document.querySelectorAll("label")[1]
let lassunto = document.querySelectorAll("label")[2]
let nome = document.querySelector("#nome")
let email = document.querySelector("#email")
let assunto = document.querySelector("#assunto")
let form = document.querySelector("form")
let botao = document.querySelector("button")



// Alterando cores e formatacao form
lnome.style.color ="white"
lemail.style.color = "white"
lassunto.style.color = "white"
nome.style.background = "green"
email.style.background = "green"
assunto.style.background = "green"
form.style.width = "300px"
form.style.margin = "10px auto"


//evento 
botao.addEventListener('click', function clicar(){
    form.style.border = "2px solid black"    
    let txtEmail= document.querySelector('#txtEmail')
    
    if(email.value.indexOf('@') == -1 || email.value.length < 8|| email.value.indexOf(".") == -1){
        email.style.background = "red"
        txtEmail.innerHTML = 'E-mail invalido'
        txtEmail.style.color = 'red'
    }else{
        txtEmail.innerHTML = "email valido"
        txtEmail.style.display = 'none'
        email.style.background="green"
    }

let txtnome= document.querySelector('#txtNome')
if(nome.value.length < 3){
    nome.style.background = "red"
    txtnome.innerHTML = 'nome invalido'
    txtnome.style.color = 'red'
}else{
    txtnome.innerHTML = "nome valido"
    txtnome.style.display = 'none'
    nome.style.background="green"
    }
    
    let txtassunto= document.querySelector('#txtAssunto')
    if(assunto.value.length < 10){
        txtassunto.innerHTML = 'assunto invalido'
        txtassunto.style.color = 'red'
        assunto.style.background = "red"
    }else{
        txtassunto.style.display = 'none'
        assunto.style.background="green"
        txtassunto.innerHTML = "assunto valido"
    }
})





