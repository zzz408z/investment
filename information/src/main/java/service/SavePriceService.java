package service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CoinsRepository;
import repository.PricesRepository;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
@Slf4j
public class SavePriceService {

    @Autowired
    CoinsRepository coinsRepository;
    @Autowired
    PricesRepository pricesRepository;

    static Api_client apiClient = new Api_Client("빗썸 API KEY","빗썸 API Secret Key");

    static Map<String,Double> preVolumeMap = new HashMap<>();

    @PostConstruct
    private void initDelAllPrices() throws Exception {
        log.info("[initDelAllPrices] 프로그램 최초 실행 시, 기존 Price 데이터 삭제 (지운 데이터: " +pricesRepository.count()+")");
        pricesRepository.deleteAll();
    }
}
