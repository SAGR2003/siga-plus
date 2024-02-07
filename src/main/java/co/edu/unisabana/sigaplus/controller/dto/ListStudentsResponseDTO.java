package co.edu.unisabana.sigaplus.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListStudentsResponseDTO<T> {
    private List<T> listStudentsResponse;
}
