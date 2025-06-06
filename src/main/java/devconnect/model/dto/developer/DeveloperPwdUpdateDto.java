package devconnect.model.dto.developer;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data @NoArgsConstructor @AllArgsConstructor
public class DeveloperPwdUpdateDto {
    private String matchPwd;
    private String newPwd;
}
