Entity
JPA automatically crate table from java code
By using annotations
Useful for dev and testing

spring.jpa.hibernate.ddl-auto=
                                none ->No Action
                                create-only -> database table only creates
                                drop ->database tables are droped
                                create -> Database tables are dropped followed by database tables creation
                                create-drop -> Database tables are dropped followed by database tables creation
                                                on app shutdown all tables are dropped
                                validate -> validate table schema
                                update ->Update database table schema
