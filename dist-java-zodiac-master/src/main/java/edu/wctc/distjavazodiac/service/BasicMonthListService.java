package edu.wctc.distjavazodiac.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.wctc.distjavazodiac.entity.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MonthRepository;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BasicMonthListService implements MonthListService {
    @Autowired
    private MonthRepository monthrepo;

    @Override
    public List<Month> getMonths() {
       List<Month> MonthList = new ArrayList<>();
       monthrepo.findAll().forEach(MonthList::add);
       return MonthList;
    }


}
