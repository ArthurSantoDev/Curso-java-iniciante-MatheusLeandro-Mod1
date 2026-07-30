# Curso Java Para Iniciantes – Matheus Leandro Ferreira

Anotações de estudo sobre a linguagem Java: sintaxe básica, estruturas de controle, vetores/matrizes, classes, herança e polimorfismo.

---

## Estrutura de um programa em Java

Todo programa tem uma `public class`, e dentro dela o método `main` (`psvm` = `public static void main`). Dentro do `main` ficam os comandos.

## Identificadores

São rótulos (labels) usados para nomear dados ou endereços:

- O primeiro caractere é uma letra.
- Não pode ter símbolos ou espaços.
- Por convenção, começa com letra minúscula.

## Caracteres e pontuações

| Símbolo | Função |
|---|---|
| `{}` | Chaves — delimitam um bloco de código com instruções |
| `;` | Ponto e vírgula — termina uma declaração/linha de código |
| `,` | Vírgula — delimitador de dados, separa valores |
| ` ` | Espaço em branco — separa palavras |

## Tipos de dados primitivos

Java possui **8 tipos primitivos**, divididos em 4 categorias:

- Tipos inteiros
- Tipos de ponto flutuante
- Tipo caractere
- Tipo lógico

## Operadores

Ao usar operadores de atribuição, o operando da direita deve ser compatível com o tipo da variável.

Existem dois grupos de variáveis: **primitivas** e **de objeto (wrapper)**.

### Variáveis primitivas

```java
int idade = 20;
double altura = 1.84;
float alturaf = 1.84F;
String nome = "Arthur";
char genero = 'M';
boolean falso = false;

System.out.println("Idade: " + idade);
System.out.println("Altura: " + altura);
System.out.println("Altura: " + alturaf);
System.out.println("Nome: " + nome);
System.out.println("Genero: " + genero);
System.out.println("Bool: " + falso);
```

As variáveis de objeto (wrapper classes) têm o mesmo nome do tipo primitivo, mas começam com letra maiúscula — exceto `char`, que vira `Character`. Também existem `Long`, `Short`, `Byte`, cuja diferença é a capacidade de armazenamento: `float` para números não tão grandes e `double` para números muito grandes.

**Variáveis de objeto (wrappers):** são chamadas assim porque possuem métodos — usando o `.` é possível acessar esses métodos.

## If vs Switch

- **If:** avalia expressões lógicas, suporta intervalos, é mais flexível.
- **Switch:** avalia apenas valores fixos, suporta apenas igualdades, é mais inflexível.

```java
// Exemplo com if
if (media >= 6) {
    System.out.println("Aluno aprovado com média: " + media);
} else if (media >= 5 && media < 6) {
    System.out.println("Aluno em recuperação com média: " + media);
} else {
    System.out.println("Aluno reprovado com média: " + media);
}
```

```java
// Exemplo com if e operador lógico
String nomeAluno = "Arthur";
int idadeAluno = 18;
double alunoAltura = 1.82;

if (idadeAluno >= 18 || alunoAltura >= 1.80) {
    System.out.println("Aluno não pode entrar no time de basquete");
} else {
    System.out.println("Aluno pode entrar no time de basquete");
}
```

```java
// Exemplo com switch
int mes = 2;

switch (mes) {
    case 1: {
        System.out.println("Janeiro");
        break;
    }
    case 2: {
        System.out.println("Fevereiro");
        break;
    }
    case 3: {
        System.out.println("Março");
        break;
    }
    default: {
        System.out.println("Mês inválido");
        break;
    }
}
```

## Laços de repetição

- **For:** usado quando sabemos quantas vezes vamos repetir.
- **While:** repete até a condição mudar (deixar de ser verdadeira).
- **Do-while:** garante pelo menos uma execução.

### For

O `for` tem 3 parametrizações: a inicialização (valor inicial), a condição de parada e o incremento (`i++`). Ele inicia em 0 e vai até o número indicado, exclusive (número - 1).

```java
for (int i = 0; i < 10; i++) {
    System.out.println("Valor de i = " + i);
}
```

Saída — a cada iteração ele testa a condição, imprime e incrementa, até a condição se tornar falsa:

```
Valor de i = 0
Valor de i = 1
Valor de i = 2
Valor de i = 3
Valor de i = 4
Valor de i = 5
Valor de i = 6
Valor de i = 7
Valor de i = 8
Valor de i = 9
```

### While

```java
int i = 0;
while (i < 10) {
    System.out.println("O valor de i é: " + i);
    i++;
}
```

O `while` fica rodando, imprimindo e incrementando até a condição ser falsa (nesse caso, até `i` chegar a 10). Para isso precisamos de uma variável de controle e uma condição — se a condição for sempre verdadeira, o laço será infinito, mas podemos usar `break` para interrompê-lo quando alguma condição for atingida.

### Do-while

```java
int i = 0;
do {
    System.out.println("O valor de i é: " + i);
    i++;
} while (i < 10);
```

Esse laço garante que o bloco rode pelo menos uma vez, mesmo que a condição não seja atendida — a primeira execução é obrigatória.

### Break e continue

Podemos usar `break` para sair da estrutura de repetição, ou `continue` para pular a iteração atual e não executar o que está abaixo dele.

```java
// break
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println("O valor de i é: " + i);
}
```

```java
// continue
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        continue;
    }
    System.out.println("O valor de i é: " + i);
}
```

## Vetores e matrizes

Um vetor (array) armazena múltiplos valores de um mesmo tipo — como uma fila de caixas numeradas, onde cada uma guarda um valor. Tem tamanho fixo e todo vetor precisa ser inicializado. Os valores de cada posição podem ser atribuídos através do índice.

```java
int[] numero = new int[5];

numero[0] = 10;
numero[1] = 20;
numero[2] = 30;
numero[3] = 40;
numero[4] = 50;
```

O vetor começa no índice 0 — um vetor de tamanho 5 vai de 0 a 4.

### Percorrendo um vetor com for

```java
int[] numero = new int[5];

numero[0] = 36;
numero[1] = 6;
numero[2] = 24;
numero[3] = 18;
numero[4] = 12;

for (int i = 0; i < numero.length; i++) {
    System.out.println("O valor do índice " + i + " é: " + numero[i]);
}
```

### Inicialização direta

```java
int[] idades = {18, 21, 25, 30, 35};
String[] nomes = {"Ana", "Arthur", "Murillo", "João", "Maria"};
```

### Percorrendo dois vetores com for aninhado

```java
int[] idades = {18, 21, 25, 30, 35};
String[] nomes = {"Ana", "Arthur", "Murillo", "João", "Maria"};

for (int i = 0; i < nomes.length; i++) {
    for (int x = 0; x < idades.length; x++) {
        if (x == i) {
            System.out.println("O nome do aluno é: " + nomes[i] + " e a idade é: " + idades[x]);
        }
    }
}
```

### For-each

```java
int[] numero = new int[5];

numero[0] = 36;
numero[1] = 6;
numero[2] = 24;
numero[3] = 18;
numero[4] = 12;

for (Integer n : numero) {
    System.out.println("O valor é: " + n);
}
```

No for-each, definimos o tipo do vetor, uma variável, `:` e o vetor a ser percorrido (no caso, `numero`).

### Alterando uma posição do vetor

```java
for (int i = 0; i < numero.length; i++) {
    if (i == 2) {
        numero[i] = 60;
        System.out.println(numero[2]);
    }
}
```

### Matrizes

Uma matriz é um array bidimensional — como uma tabela, com linhas e colunas. Cada elemento é acessado por dois índices: linha e coluna.

```java
int[][] matriz = new int[3][4]; // 3 linhas, 4 colunas
```

Para percorrer uma matriz, usamos dois `for` aninhados:

```java
int[][] matriz = new int[3][4];

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.println(matriz[i][j] + " ");
    }
    System.out.println();
}
```

Também é possível fazer atribuição direta:

```java
int[][] numeros = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## Classes

No exemplo abaixo, a classe `Pessoa` define suas características através de variáveis — todas essas características ficam ligadas ao objeto `Pessoa`.

```java
public class Pessoa {
    String nome;
    int idade;
    double altura;
    String cpf;
}
```

Com a classe criada, podemos instanciar um objeto dela usando `new`, para poder manipular as variáveis já definidas na classe:

```java
Pessoa p = new Pessoa();
```

### Proteção dos atributos

As variáveis podem ter os seguintes modificadores de acesso:

- **`public`**: acessível por todos os arquivos de código do projeto.
- **`private`**: sem acesso direto por outros arquivos.
- **`protected`**: acessível apenas por classes do mesmo pacote.

Quando uma classe (modelo de dados) é instanciada, temos um objeto. Para mantê-lo encapsulado, atributos `private` são acessados de fora através de métodos:

- **Set**: define um valor em uma variável.
- **Get**: retorna o valor de uma variável.

```java
public void setNome(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public int getIdade() {
    return idade;
}

public void setAltura(double altura) {
    this.altura = altura;
}

public double getAltura() {
    return altura;
}

public void setCpf(String cpf) {
    this.cpf = cpf;
}

public String getCpf() {
    return cpf;
}
```

`this` se refere ao próprio objeto; o segundo `nome`, `idade`, etc. são os parâmetros do método. Isso caracteriza o encapsulamento.

```java
Pessoa p = new Pessoa();

p.setAltura(1.84);
p.setCpf("123.456.789.00");
p.setIdade(20);
p.setNome("Arthur");
```

### Construtores

Quem cria o objeto é o construtor. O Java gera um construtor padrão automaticamente, mas também podemos criar construtores customizados:

```java
public Pessoa() {
    System.out.println("Teste construtor");
}

public Pessoa(String nome, int idade, double altura, String cpf) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.cpf = cpf;
}
```

Assim, temos mais de um construtor, cada um recebendo um conjunto diferente de atributos. É possível criar um objeto `Pessoa` sem passar nada, ou passando todos os atributos de uma vez:

```java
Pessoa p2 = new Pessoa("Maria", 25, 1.65, "987.654.321.00");
```

Nesse caso não usamos nenhum `set`, mas eles continuam disponíveis caso seja necessário alterar algo depois. Também é possível criar um construtor que receba apenas o nome, por exemplo.

### toString()

Usado para sobrescrever a forma como o objeto é impresso, evitando que ele retorne apenas o endereço/código do objeto:

```java
@Override
public String toString() {
    return "Pessoa{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", altura=" + altura +
            ", cpf='" + cpf + '\'' +
            '}';
}
```

## Herança

É um mecanismo que permite criar uma nova classe a partir de uma classe já existente. Ao herdar, a nova classe recebe os métodos e atributos da classe original, podendo também sobrepor (redefinir) comportamentos.

A herança normalmente produz subclasses mais específicas — a subclasse herda da superclasse. Vale sempre se perguntar se a classe que está herdando é realmente do mesmo "tipo" da classe herdada.

A classe no topo da hierarquia é chamada de **superclasse** (classe pai). Em Java, usa-se a palavra-chave `extends` para herdar.

```java
// PersonagemDBZ.java
package model;

public class PersonagemDBZ {
    public String nome;
    public int poderDeLuta;

    public void lutar() {
        System.out.println(nome + " está lutando!");
    }
}
```

```java
// Goku.java
package model;

public class Goku extends PersonagemDBZ {
    public void kamehameha() {
        System.out.println(nome + " lançou um Kamehameha");
    }
}
```

```java
// Vegeta.java
package model;

public class Vegeta extends PersonagemDBZ {
    public void finalFlash() {
        System.out.println(nome + " lançou um Final Flash");
    }
}
```

```java
// Main.java
import model.Goku;
import model.Vegeta;

public class Main {
    public static void main(String[] args) {
        Goku goku = new Goku();
        goku.nome = "Goku";
        goku.poderDeLuta = 9000;
        goku.lutar();
        goku.kamehameha();

        Vegeta vegeta = new Vegeta();
        vegeta.nome = "Vegeta";
        vegeta.poderDeLuta = 8000;
        vegeta.lutar();
        vegeta.finalFlash();
    }
}
```

## Polimorfismo

É a capacidade de cada classe filha ter sua própria implementação (transformação) de um método herdado. No exemplo, a classe filha faz um `@Override` do método, sobrepondo o comportamento da classe pai. É possível usar `super` para acessar o método original da superclasse além do comportamento novo, combinando os dois.

```java
goku.transformar();
vegeta.transformar();

// Na superclasse (PersonagemDBZ)
public void transformar() {
    System.out.println(nome + " está se transformando!");
}
```
