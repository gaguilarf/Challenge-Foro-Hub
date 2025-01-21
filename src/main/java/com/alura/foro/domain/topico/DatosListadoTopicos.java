package com.alura.foro.domain.topico;

import java.time.LocalDate;

public record DatosListadoTopicos(String titulo, String mensaje, LocalDate fecha_creacion, String status, String autor, String curso ) {
    public DatosListadoTopicos(Topico topico) {
        this(topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion().toLocalDate(), String.valueOf(topico.getStatus()),topico.getAutor(), topico.getCurso());
    }
}
