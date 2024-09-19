# Entidades JPA

Vamos usar a JPA para representar o a tabela do banco de dados.

- crie uma classe Medico no pacote medico
- Dentro da classe Medico sera usado a classe Especialidade e também criaremos a classe Endereco no pacote endereco
- Transformar a classe Medico em JPA colocando:

> @Table(name = "medicos")
  @Entity(name = "Medico")

>@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id") 

> @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   
 > @Enumerated(EnumType.STRING)
   
  > @Embedded
  

Na classe Endereco em JPA vamos colocar uma tabela encima da outra assim ficamdo uma só

> @Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor