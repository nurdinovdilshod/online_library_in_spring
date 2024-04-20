package uz.pdp.domains;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class User {
    private String id;
    private String name;
    private String username;
    private String password;
}
