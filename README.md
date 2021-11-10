# SmallProjects
Pequenos projetos para testes e prova de conceito

# ReadExcelFile

Lê um arquivo Excel.
Projeto feito com base [Tutorial Java - Ler arquivo xlsx com java - Planilha Excel](https://youtu.be/qH5Yu34Unvg).
Foi feito um projeto Maven pegando as últimas versões das bibliotecas apresentadas no vídeo.

No teste foi criado um arquivo Excel com o conteúdo seguinte

  A   |    B    |  C  |  D  |     E      |
------|---------|-----|-----|------------|
Maria	| Antonia	| 35	| Ok	| 95         |
Jose	| Ricardo	| 60	| Not	| VERDADEIRO |

Obs: 
- E1 = C1 + D2
- E2 = 5=5

Resultado ao rodar: 

```
ERROR StatusLogger Log4j2 could not find a logging implementation. Please add log4j-core to the classpath. Using SimpleLogger to log to the console...
Tipo String: Maria
Tipo String: Antonia
Tipo Numeric: 35.0
Tipo String: Ok
Tipo Formula: C1+C2
>> Last Eval: 95.0
Tipo String: Jose
Tipo String: Ricardo
Tipo Numeric: 60.0
Tipo String: Not
Tipo Formula: 5=5
Not Expected Type:  BOOLEAN
```
 
