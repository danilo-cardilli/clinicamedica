# Gerando tokens JWT

Criar a JWT
````
try {
    Algorithm algorithm = Algorithm.RSA256(rsaPublicKey, rsaPrivateKey);
    String token = JWT.create()
        .withIssuer("auth0")
        .sign(algorithm);
} catch (JWTCreationException exception){
    // Invalid Signing configuration / Couldn't convert Claims.
}
````