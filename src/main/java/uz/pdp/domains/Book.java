package uz.pdp.domains;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Book {
    private String id;
    private String title;
    private String description;
    private Integer createdBy;

}
