Nome:

Flyweight

Problema:

Em um sistema onde são gerados inúmeros quadrados, com diferentes cores e tamanhos, seria necessária uma enorme quantidade de memória para armazenar cada um dos objetos, mesmo sendo exibido apenas um quadrado por vez. O que é um grande problema tendo em vista que alguns computadores não possuem essa capacidade.  
Solução:

Como os quadrados gerados são utilizados um por vez, uma boa solução para esse problema é usar o padrão de projeto flayweigth. Pois esse permite que sejam gerados apenas um quadrado para cada cor e sejam alterados os tamanhos de seus lados, evitando a criação de vários objetos sem necessidade.

Consequências:
Enquanto o consumo de RAM é diminuído, pode ocorrer um aumento excessivo no uso da CPU. Pois não estariam sendo gerados muitos objetos, mas os objetos gerados estariam sendo modificados várias vezes.
Pode tornar mais difícil a manutenção do sistema. Pois um mesmo objeto estará sendo modificado e reutilizado em diferentes partes do código.
