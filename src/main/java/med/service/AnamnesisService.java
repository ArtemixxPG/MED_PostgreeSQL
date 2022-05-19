package med.service;

import org.springframework.web.multipart.MultipartFile;

public interface AnamnesisService {
    void save(MultipartFile file);
}
