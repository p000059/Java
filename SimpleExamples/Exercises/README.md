<html>
  <body>
    <h1>Executar o primeiro programa em JAVA</h1>
    <ul>
      <li>Acesse diretamente o diretório raiz do Windows, que na maioria da vezes será "C:"</li>
      <li>Dentro do diretório raiz, crie uma pasta diretamente em "C:" , nomeie a pasta com um nome fácil e sujestivo com "Java", por exemplo.</li>
      <li>Acesse o diretorio Java clicando duas vezes -> "C:\Java"</li>
      <li>Dentro do diretorio criado , crie um arquivo de texto nomeando-o e salve-o mudando a sua extensão de ".txt" para extensão ".java", ex: MeuPrograma.java
        <ul>
          <li>No Windows, vai aparecer uma mensagem de alerta sobre a extensão do arquivo, apenas confirme a mudança.</li>
          <li>Com o botão direito do mouse, abra o arquivo utilizando as opções do Windows, como "Abrir com..." com um editor de sua preferência, notepad, notepad++ ou outro.</li>
        </ul>
      </li>
    </ul>  
    <h2>Escrevendo no Arquivo</h2>
    <h3>Depois de seguir o passo anterior, escreva no arquivo o seguinte texto: </h3>  
    <hr>
        <pre>   
                public class MeuPrograma(){                     
                     public static void main(String[] args){                         
                         System.out.println("Hello Girls!");
                     }
                }
        </pre>
    <ht>
    <h3>Após digitado o trecho acima, salve o arquivo e feche-o se preferir, mas não é obrigatório o fechamento deste.</h3>
    <h2>Executando o programa</h2>
    <h3>Abra um terminal de comando, mais conhecido com "cmd" dentro da pasta "C:\Java"</h3>
    <p>
      # Caso você não consiga executar essa operação, simplesmente abra o "cmd" no executar do windows ou procure na barra de pesquisa.<br>
      # Dentro do terminal, tente navegar até a pasta, digitando o comando "cd /" para voltar ao diretório principal(C:), e "cd /Java" para acessar o diretorio criado.
    </p>
    <h2>Executando o programa</h2>
    <h3>Já estando dentro do diretório execute os passos:</h3>
    <ul>
      <li>Executar no terminal cmd</li>
      <li>Digite: javac MeuPrograma.java</li>
      <li>O comando acima vai compilar o programa salvo com a extesão Java.</li>
      <li>Digite: java MeuPrograma.java</li>
      <li>O comanda acima executa o programa compilado em Java.</li>
    </ul>
    <h3>Se tudo der certo: </h3>
    <p>A saída do programa no terminal será: </p>
    <hr>
      <p>Hello Girls!
    <hr>
    <h3>Dicas importantes</h3>
    <ul>
      <li>O nome do arquivo tem que ser o mesmo nome da classe principal, caso contrário, o programa vai retornar um erro.</li>
      <li>Tente se localizar dentro do terminal do windows (cmd) pois o compilador só vai compilar um arquivo com extensão java.</li>
      <li>Copie o arquivo como ele está, se faltar algum caracter, o java vai retornar um erro tem tempo de compilação.</li>
      <li>A saída será no terminal do Windows.</li>
    </ul>
  </body>
</html>


