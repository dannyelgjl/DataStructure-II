// Minha funções

// Ao carregar a página
window.onload=function() {
    // listar();
    document.getElementById('frmCadastro').addEventListener('submit', adicionarOuAlterar);
    // document.getElementById('frmCadastro').addEventListener('submit', listar);
}

var idAlterar = null;

// Cadastrar/Salvar
function adicionarOuAlterar(e) {
    var nom = document.getElementById('txtNome').value;
    var p = {
        nome : !nom ? "sem Nome" : nom, // if (nom = "") { nom = "sem nome" }
        matric : document.getElementById('txtMatricula').value,
        idad : document.getElementById('txtIdade').value,
    }
    console.log(nom, p);

    if (idAlterar == null) {
        adicionar(p);
    }else if (idAlterar > 0) {
        idAlterar(p);
    }else {
        alert('Ação desconhecida');
    }
    
    e.preventDefault();
    
}

function adicionar(p) {
    var pessoas = [];
    var idValido = 1;

    if (localStorage.getItem('value') !== null) {
        pessoas = JSON.parse(localStorage.getItem('value'));

        if (pessoas.length > 0) {
            idValido = (function obterIdValido() {
                for(var i = 0; i < pessoas.length; i++) {
                    if (pessoas[i].Id != i+1) {
                        return i + 1;
                    }
                }
            })();
        }
    }

    var pessoa = {
        Id: idValido,
        Nome: p.nome,
        Matricula: p.matric,
        Idade: p.idad
    };


    pessoas.push(pessoa);
    console.log(pessoa)

}


