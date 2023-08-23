@Qualifier
In case of multiple implimentations we of an interface at the time of compilation framework will get ambiguity.
To remove that we can use @Qualifier.
Here Trainer hase 3 implementations.
    CricketTrainer
    FootBallTrainer
    HockeyTrainer
    we can use @Qualifier("footBallTrainer") for Autowiring

@Primary
    If we dont want to use above @Qualifier, We can use @Primary in any of the implimentation.
    We cant make multiple classes primary

Note : If we mix @Qualifier and @Primary together @Qualifier has more priority.
