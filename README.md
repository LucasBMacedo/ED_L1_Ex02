📁 Projeto: Encontrar o Menor Valor de um Vetor (Recursivo)
📌 Descrição: >
  Aplicação em Java que utiliza uma função recursiva para encontrar o menor valor dentro de um vetor de inteiros.
  A função começa a verificação a partir da última posição do vetor, que é passada como menor valor inicial.

🗂️ Estrutura de Arquivos:
  - 📄 src/controller/MenorValorDoVetor.java: Contém o método recursivo que encontra o menor valor.
  - 📄 src/view/Principal.java: Responsável pela interação com o usuário, entrada dos dados e exibição do resultado.

🧠 Lógica da Recursividade:
  método: menorvalordovet(int[] vetor, int indice, int menorAtual)
  explicação:
    - ✋ Condição de parada: Se `indice < 0`, significa que percorremos todo o vetor. Retornamos o menor valor encontrado até então.
    - 🔁 Relação recursiva: 
        - Compara o valor atual do vetor (`vetor[indice]`) com `menorAtual`.
        - Se for menor, atualiza `menorAtual`.
        - Reduz `indice` e faz a chamada recursiva novamente.

💬 Exemplo de Execução:
  entrada:
    - Tamanho do vetor: 5
    - Valores: [8, 3, 15, 2, 6]
  saída:
    - O menor valor contido no vetor é: 2

📥 Entrada:
  - O usuário informa o tamanho do vetor.
  - Insere os valores manualmente via `JOptionPane`.

📤 Saída:
  - Exibe o menor valor encontrado no vetor.

📌 Observações:
  - A lógica utiliza o último valor como o menor inicial, conforme pedido no exercício.
  - O código foi estruturado para seguir os princípios de Clean Code: sem comentários desnecessários, com variáveis claras e legíveis.

👨‍💻 Autor:
  Desenvolvido por **Lucas Bezerra de Macedo**.
