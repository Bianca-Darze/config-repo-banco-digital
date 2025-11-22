Spring Cloud Config 

Propósito e Funcionalidade do Projeto

O projeto demonstra como utilizar o Spring Cloud Config para centralizar e externalizar configurações de microsserviços. Em vez de armazenar parâmetros sensíveis ou variáveis internas no código, as aplicações passam a obter essas informações a partir de um Config Server conectado a um repositório Git, o que torna o sistema mais organizado, seguro e fácil de manter.

Necessidade no Cenário de Banco Digital

Em um banco digital, diferentes ambientes exigem configurações específicas, e os serviços precisam ser atualizados sem interrupção. A centralização evita divergências entre ambientes, reduz riscos operacionais e permite controle mais rigoroso de valores sensíveis, como URLs, limites de operação e credenciais. Assim, a arquitetura garante segurança, precisão e estabilidade do ecossistema bancário.

Configuração Externalizada e Centralizada

A configuração externalizada consiste em manter dados de ambiente fora do código-fonte, permitindo ajustes sem recompilar a aplicação. Quando essas configurações são centralizadas em um único repositório, todos os microsserviços passam a consultar a mesma fonte de verdade, garantindo consistência e simplificando o gerenciamento entre ambientes distintos.

Implementação Realizada

O projeto inclui um Config Server configurado para buscar arquivos de propriedades no Git e um serviço cliente (account-service) que consome essas configurações conforme o perfil ativo, como dev ou prod. O cliente é capaz de atualizar valores em tempo real, sem reinicialização, e todos os arquivos de configuração ficam versionados e organizados no repositório.

Refresh Dinâmico

O uso de anotações apropriadas permite que o serviço cliente recarregue valores alterados no repositório git sem ser reiniciado. Isso facilita a manutenção e torna o processo de atualização de parâmetros mais ágil e seguro, especialmente em sistemas que precisam de ajustes frequentes.

Proteção de Configurações Sensíveis

O Config Server foi configurado com suporte à criptografia, permitindo que senhas, chaves e credenciais sejam armazenadas de forma cifrada no Git. Apenas o servidor é responsável por descriptografar esses valores, evitando exposição indevida e garantindo conformidade com requisitos de segurança típicos de sistemas bancários.