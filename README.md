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

***Questão 04:*** Considere o método abaixo, presente em uma classe JAVA que realiza uma conexão com um banco de dados ***MySQL***.

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
1. **con** é do tipo ConnectionManager, uma interface do parcote **java.mysql.jdbc**.
2. Uma exceção do tipo ***SQLException*** será lançada se a classe ***Driver*** não estiver presente na biblioteca do projeto.
3. Uma exceção do tipo ***ClassNotFoundException*** será lançada se a interface ***DriverManager*** não estiver na biblioteca do projeto.
4. **Driver é classe da biblioteca do Driver JDBC do MySQL, presente no pacote com.mysql.jdbc**.
5. **st** é do tipo ***PreparedStatement***, uma interface do pacote **java.sql**.

***Questão 05:*** Considere o fragmento de código abaixo, retirado de uma classe de acesso a banco de dados em um aplicação que utilizava ***Java Database Connectivity*** - JDBC e Java 8.

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

Para tratar corretamente as exceções que poder ser lançadas no bloco ***try***, a lacuna deve ser preenchida com:
1. **ClassNotFoundException | SQLException**
2. DriverException | MySQLException
3. ClassNotFoundException | JDBCException
4. JDBCException | SQLException
5. SQLException | DriverException



