package med.service;

import med.DAO.AnamnesisDAO;
import med.entyties.Anamnesis;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AnamnesisServiceImpl implements AnamnesisService {

    private AnamnesisDAO anamnesisDAO;

    public AnamnesisServiceImpl(AnamnesisDAO anamnesisDAO) {
        this.anamnesisDAO = anamnesisDAO;
    }

    @Override
    public void save(MultipartFile file) {
        if (file.isEmpty()) {
            System.out.println("");
            System.out.println("Please select a CSV file to upload.");
        } else {
            //������� �������� �� csv �����, ����� �������� �� ������������� �����, �������� ������ ���, ��� � ������
//            Reader reader = null;
//            List<String[]> list = new ArrayList<>();
//            try {
//                try {
//                    reader = new BufferedReader(new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8));
//                } catch (UnsupportedEncodingException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                CSVReader csvReader = new CSVReader(reader);
//                try {
//                    list = csvReader.readAll();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } catch (CsvException e) {
//                    e.printStackTrace();
//                }
//                try {
//                    reader.close();
//                    csvReader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//
//                }
//                list.remove(0);
            if (file.getOriginalFilename().contains("�������")) {

                try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8))) {
                    CsvToBean<Anamnesis> csvToBean = new CsvToBeanBuilder(reader)
                            .withType(Anamnesis.class)
                            .withSkipLines(1)
                            .withIgnoreLeadingWhiteSpace(true)
                            .withSeparator(';')
                            .build();

                    List<Anamnesis> anamneses = csvToBean.parse();
                    anamnesisDAO.saveAll(anamneses);

                } catch (IOException e) {
                    System.out.println("An error occurred while processing the CSV file.");
                    e.printStackTrace();
                }
//
//
//            }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
            }
        }
    }
}
