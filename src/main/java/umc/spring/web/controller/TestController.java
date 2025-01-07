package umc.spring.web.controller;


import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.spring.apiPayload.ApiResponse;
import umc.spring.web.dto.StoreResponseDTO;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    
    @PostMapping("/")
    public ApiResponse<String> test() {
        return ApiResponse.onSuccess("성공하였습니다.");
    }
}
