package br.com.jaques.financas.domain;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")

public class Usuario implements Serializable{

    @EqualsAndHashCode.Include
    @Id
    @Column(name = "idUsuario", nullable = false, unique = true)
    private Long idUsuario;

    @Column(name = "descricaoUsuario", length=50)
    private String descricaoUsuario;

    @Column(name = "dataNascimento")
    private LocalDateTime dataNascimento;

    @Column(name = "dataCriacao")
    private LocalDateTime dataCriacao;

    @Column(name = "dataAlteracao")
    private LocalDateTime dataAlteracao;

    @Column(name = "idBanco", unique = true)
    private Long idBanco;

    @Column(name = "idConta", unique = true)
    private Long idConta;

    @Column(name = "idGasto", unique = true)
    private Long idGasto;

    @Column(name = "idCarteira", unique = true)
    private Long idCarteira;
}
