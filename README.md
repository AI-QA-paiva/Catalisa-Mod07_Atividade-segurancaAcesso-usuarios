# Catalisa-Mod07_Atividade-segurancaAcesso-usuarios
Atividade para fixar conteudo sobre utilização do framework Spring Security

 Configurando Spring Security
Crie uma API para acesso de usuários e configure o Spring Security na sua aplicação, a sua senha deve ter criptografia.

Requisitos: 
- Nome do banco: usuarios
- Usuário deve conter os seguintes atributos: 
Nome
Idade
Telefone
Login
Senha
- O retorno do usuário deve conter apenas nome, login e senha criptografada.


-------

procedimento contempla a criação da estrutura basica com pacotes Model, Repositoty, Service e Controller, acrescentando pacote DTo para realizar filtro de resposta, a requisição 
tipo Get na consulta de usuarios cadastrados, para trazer apenas os campos solicitados.
em seguida cada pacote recebe sua java class (exemplo: UsarioController, UsuarioService, UsuarioModel, UsuarioRepository, UsuarioResponseDto, UsuarioRequestDto) onde indicamos além
das anotações próprias de cada classe, temos a implementação da logica para as classes Controller e Service;
Em seguida criar um novo pacote com uma nova classe,  SecurityConfig onde é feita toda a implementação de anotação @EnableWebSecurity e extendo a classe com a interface
WebSecurityConfigurerAdapter. 
Apos a configura~ção é feito nas classes controller e Service o incrementando a autorização e a autenticação do usuario.
