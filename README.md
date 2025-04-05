# Projeto_Integrador_V_B
Este projeto foi desenvolvido como parte de um trabalho acadêmico na PUC GO, com o objetivo de criar um sistema de monitoramento ambiental utilizando Arduino e Java. O sistema captura dados de temperatura, umidade e luminosidade por meio de sensores conectados ao Arduino e os exibe em um protótipo de aplicativo Java para visualização em tempo real.

Objetivo:
Desenvolver uma solução integrada que permita:
 -Coletar dados ambientais (temperatura, umidade e luminosidade) usando sensores conectados a um Arduino.
 -Transmitir os dados para um computador via comunicação serial.
 -Visualizar as informações em uma interface Java simulando um aplicativo de monitoramento.

Tecnologias e Componentes
 -Hardware (Arduino)
 -Microcontrolador: Arduino UNO

Sensores:
Temperatura, Umidade e Luminosidade
Comunicação: USB Serial (COM3)

Linguagem: Java
Gerenciamento de Dependências: Maven

Bibliotecas:
jSerialComm (Comunicação Serial com Arduino)

Funcionalidades:
1. Leitura Serial (Arduino → Java)
O Arduino envia dados via porta serial (COM3 ou similar).

O Java lê os valores usando jSerialComm.

2. Processamento dos Dados
Validação dos valores recebidos.

Exibição no console ou em uma interface gráfica.

3. Modo Simulação (Caso Arduino não esteja conectado)
Gera dados aleatórios para testes.

4. Protótipo de Aplicativo
Exibe temperatura, umidade e luminosidade em uma interface simples.

![DiagramaUML_PI_VB drawio](https://github.com/user-attachments/assets/a07657d8-6346-4aa9-86ba-40158fd2d53a)
