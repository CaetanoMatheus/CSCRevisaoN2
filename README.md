# **REVISÃO N2**
---
## JDBC 
***Questão 01:*** Implementar um aplicação JDBC as operações abaixo e as operações no banco de dados apresentadas abaixo.

* Inclusão de funcionários (matricula, nome, endereço, telefone, cargo, departamento)
* Consultar funcionário
* Alterar funcionário
* Excluir funcionário
* Listar funcionários cadastrados

[RESOLUÇÃO](https://github.com/CaetanoMatheus/CSCRevisaoN2/blob/master/RevisaoN2/src/br/com/unialfa/ex01/dao/EmployeeDao.java)

***Questão 02:*** Utilize a classe FonteDeDados para escrever um aplicação para acessar o banco de dados. Escreva métodos para criar e remover a tabela abaixo.

Nome da tabela: PRODUTO
codigo INT PRIMARY KEY
nome VARCHAR(30)
preco REAL
quantidade INT
marca VARCHAR(20)

[RESOLUÇÃO](https://github.com/CaetanoMatheus/CSCRevisaoN2/blob/master/RevisaoN2/src/br/com/unialfa/ex02/DataSource.java)


***Questão 03:*** O método a seguir está presente em um classe de acesso a dados (DAO) de uma aplicação construída em JAVA utilizando JDBC.

```java
public int salvarCliente(int id, String nome, double renda) {
    try {
        ......
        st.setInt(1, id);
        st.setString(2, nome);
        st.setDouble(3, renda);
        retorno = st.executeUpdate();
    } catch (SQLException e) {
        retorno = -1;
    }
    return retorno;
}
```
Considere que: A variável **conn** é da interface ***Connection***, **st** é da interface ***PreparedStatement*** e **retorno** é uma variável do tipo int, todas declaradas e inicializadas anteriormente. Uma conexão com o banco de dados que contém a tabela cliente foi estabelecida com sucesso e em condições ideais. A tabela cliente possui os campos: **id** - inteiro, não nulo, chave primária | **nome** - cadeia de caracteres | **renda** - real.
Nestas condições, para que o método esteja correto a lacuna deve ser preenchida com a seguinte instrução:

1. st = conn.prepareStatement("insert into cliente (id, nome, renda) values (id, nome, renda)");
2. st = conn.preparedStatement("insert into cliente (id, nome, renda) values (?, ?, ?)");
3. st = conn.prepareStatement("insert into cliente (id, nome, renda) values ("+id+","+nome+","+renda+")");
4. st = conn.executeStatement("insert into cliente values ("+id+","+nome+","+renda+")");
5. **st = conn.prepareStatement("insert into cliente (id, nome, renda) values (?, ?, ?)");**

***Questão 04:*** Considere o método abaixo, presente em uma classe JAVA que realiza uma conexão com um banco de dados *MySQL*.

```java
public int conectar() {
    try {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/meuDB", "root", "1234");
        return 1;
    } catch (ClassNotFoundException ex) {
        return 0;
    } catch (SQLException ex) {
        return 2;
    }
}
```

É corretor afirmar que: 
1. con é do tipo ConnectionManager, uma interface do parcote *java.mysql.jdbc*.
2. Uma exceção do tipo *SQLException* será lançada se a classe *Driver* não estiver presente na biblioteca do projeto.
3. Uma exceção do tipo *ClassNotFoundException* será lançada se a interface *DriverManager* não estiver na biblioteca do projeto.
4. **Driver é classe da biblioteca do Driver JDBC do MySQL, presente no pacote com.mysql.jdbc**.
5. st é do tipo *PreparedStatement*, uma interface do pacote *java.sql*

***Questão 05:*** Considere o fragmento de código abaixo, retirado de uma classe de acesso a banco de dados em um aplicação que utilizava *Java Database Connectivity* - JDBC e Java 8.

```java
String url = "jdbc:mysql://localhost:3306/empresa";
String sql = "insert into cliente (id, nome) velues (?, ?)";
Connection conn;
try {
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection(url, "root", "h3$c7Ab");
    st.setInt(1, 10);
    st.setString(2, "Marco Antonio");
    st.setString(3, "(11)5678-9087");
    st.executeUpdate();
    JOptionPane.showMessageDialog(null, "Os dados do cliente foram salvos");
    conn.close();
} catch (..... ex) {
    JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados");
}
```

Para tratar corretamente as exceções que poder ser lançadas no bloco *try*, a lacuna deve ser preenchida com:
1. **8ClassNotFoundException | SQLException***
2. *DriverException | MySQLException*
3. *ClassNotFoundException | JDBCException*
4. *JDBCException | SQLException*
5. *SQLException | DriverException*

***Questão 06:*** Para se ter acesso a um banco de dados *Mysql* a partir de um código escrito em Java e por meio de JDBC, é necessário conhecer:
1. Nome do banco, nome do *host* número da sessão.
2. Nome do *host*, número da sessão e número da porta.
3. Número do soquete, nome do *host* e número da sessão.
4. Número do soquete, nome do *host* e número da porta.
5. **Nome do banco de dados, nome no *host* e número da porta.**

---
## MVC 

***Questão 07:*** O padrão MVC é utilizado em muitos projetos devido à arquitetura que possui, o que possibilita a divisão do projeto em camadas muito definidas: o ***Model***, ***Controller*** e a ***View***.

I. Na camada de controle (*Controller*), teremos a manipulação dos inputs do usuário, sua interpreação e execução das taredas correspondentes.
II. A camada de visualização (*View*) deve ser responsável somente pela visualização, exercendo qualquer tipo de controle no fluxo de execução da aplicação.
III. Permite ao desenvolvedor reutilizar um mesmo objeto de modelo em diversas visualizações diferentes.

1. I e II apenas.
2. ***I e III apenas.***
3. II e III apenas.
4. I, II e III.

***Questão 08:*** Em uma aplicação de votação *online* desenvolvida em três camadas do tipo MVC, o *controller* é responsável por

1. ***transformar eventos gerados pela view em ações de negócio, alterando o model.***
2. transformar eventos gerados pela view em ações temporárias de negócio.
3. manipular a tela com dados de negócio que podem ser alerados diretamente com o banco de dados.
4. manipular o *model* do sistema responsável pela interface com o cliente.
5. alterar a *view* do sistema que contém a lógica do negócio.

***Questão 09:*** Com relação ao padrão de arquitetura de *software* denominado MVC (*Model-View-Controller*), é **CORRETO** afirmar que:

1. A comunicação entre a interface com o usuário (camada *View*) e as regras de negócio é definida por meio da camada que representa o modelo de dados (camada *Model*), e é a ação deste componente da arquitetura que torna possível a separação entre as camadas.
2. Quando um evento é executado em uma interface gráfica, essa interface irá se comunicar com a camada denominado *Controller*, que por sua vez se comunica com a camada que contém as regras de negócios.
3. Existem diversos *frameworks* de mercado desenvolvidos para a plataforma PHP que implementam o padrão MVC. Dentre eles podemos citar o *Struts, JSF, e o *Spring* MVC.
4. ***É característico da camada denominada *Controller*, conter a estrutura de dados que está dando suporte  à aplicação, bem como responder pelo tratamento e execução das regras de negócio da aplicação.***
5. É de responsabilidade da camada denominada *View* a interface que, dentre outras atribuições, mostra as informações ao usuário, interpreta as suas requisições e as envia diretamente para a camada *Model*.
