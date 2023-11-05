Para cada objeto concreto, que extende a interface iPhone, se cria um factory, que extende a interface iPhoneFactory.

Dessa forma, a classe cliente não se comunica diretamente com os objetos concretos. As classes factory atua como intermediário.

Porém, o código acaba ficando um pouco mais complexo.