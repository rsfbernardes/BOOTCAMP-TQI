# DIO-bootcamp-TQI :computer: :open_book: :mortar_board:

- Desafio de Projeto Git/Github
  - Repositório para guardar as anotações dos estudos do bootcamp TQI Fullstack Developer



1. ***Introdução ao Git e GitHub***

   * **CLI - Command Line Interface**

     

     | Comandos Básicos          | Windows    | Unix     |
   | :------: | :-------: | :------: |
     | Change Directory          | - cd       | - cd     |
   | Directory List            | - dir      | - ls     |
     | Make Directory            | - mkdir    | - mkdir  |
   | Delete (Remove) Directory | -del/rmdir | - rm -rf |
   
   
   
   * **Tópicos Fundamentais para entender o funcionamento do GIT**
   
     * <u>SHA1</u> - criptografia utilizada no arquivo, que gera uma hash de 40 caracteres, que identifica o arquivo
   
       
   
   * **Objetos internos do GIT**
   
     * <u>BLOBS</u>
   
       - Armazena metadados do GIT, como tipo do objeto, tamanho do arquivo, SHA1....
   
     * <u>TREES</u>
   
       - Armazenam BLOBS e SHA1 das TREES. Responsáveis por montar as estruturas de onde estão os arquivos. Podem apontar para BLOBS ou outras TREES
   
     * <u>COMMITS</u>
   
       - Junta todos os objetos. Aponta para TREES, PARENTE (último commit realizado), AUTOR, TIMESTAMP, que é o horário de quando foi criado, MENSAGEM e SHA1 do COMMIT, que é o hash de toda essa informação.
   
         
   
   * **Chaves SSH e Tokens**
   
     * <u>Chave SSH</u> é uma forma de estabelecer uma conexão segura e encriptada entre duas máquinas
   
     * <u>Criando e ativando uma chave SSH</u>
   
       * ssh-keygen -t ed25519 -C “email”
       * cat id_ed25519.pub
       * eval $(ssh-agent -s)
       * ssh-add id_ed25519
   
     * <u>Criando e utilizando um Token</u>
   
       - Acessar Developer settings
   
       - Inserir data de expiração e uma descrição e selecionar os escopos desejados (“repo”)
   
       - Guardar o token gerado e utilizar sempre que solicitado
   
         
   
   * **Passo a Passo no Ciclo de Vida**
   
     * <u>GIT INIT</u>
   
       - Inicializa um repositório
     * <u>GIT STATUS</u>
   
       - Mostra o status dos arquivos na branch
     * <u>GIT ADD</u>
   
       - Adiciona os arquivos para a área de staged (aguardando commit)
     * <u>GIT COMMIT</u>
   
       - Salva os arquivos e cria uma hash para esses arquivos. Salva os arquivos no repositório local
     * <u>GIT REMOTE ADD</u>
   
       - Vincula um repositório remoto ao repositório local
     * <u>GIT PUSH</u>
   
       - Envia os arquivos do repositório local para o repositório remoto
   
   
   
   * **Resolvendo Conflitos**
   
     * <u>Conflito de merge:</u> 
       * ocorre quando você alterou um arquivo e na mesma linha do mesmo arquivo alguém também fez uma alteração e empurrou para o repositório antes de você.
   
     * <u>Para corrigir o conflito de merge</u>
       * deve fazer um pull do arquivo para sua máquina, resolver o conflito, através de código, fazer o commit e enviar para o repositório



> **`Além das aulas`**
>
> - **`GIT REFLOG`**
>
>   - `Mostra os commits`
>
> - **`GIT RESET`**
>
>   - ```
>     Desfaz último commit local
>     ```
>
>     - ```
>       git reset —soft HEAD~1
>       ```
>
>       - `Desfaz o último commit sem apagar as alterações`
>
>     - ```
>       git reset —hard HEAD~1
>       ```
>
>       - `Desfaz o último commit e apaga todas as alterações`
>
>     - ```
>       git reset —hard(soft) 95as1234
>       ```
>
>       - `Desfaz o commit da hash 95as1234`
>
> - `GIT REVERT`
>
>   - ```
>     git revert “hash do commit”
>     ```
>
>     - `desfaz o commit remoto da hash indicada`

