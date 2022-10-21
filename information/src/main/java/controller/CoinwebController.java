package controller;

import model.Coins;
import model.Prices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CoinwebController {

    @Autowired
    WebPageService webPageService;

    @GetMapping("/")
    public String mainPage(Model model) throws Exception{
        List<Coins> coinsList = webPageService.findAllCoins();
        model.addAttribute("coinList", coinList);

        List<Prices> pricesList = new ArrayList<>();
        PriceList= webPageService.findPriceList(coinsList.get(0).getCoincode());
        model.addAttribute("priceList",priceList);
        return "main";
    }
    @GetMapping("/coin/prices")
    public String getCoinPrices(Model model, @RequestParam String coinCode) throws Exception {

        List<Prices> priceList = new ArrayList<>();
        priceList = webPageService.findPriceList(coinCode);
        model.addAttribute("priceList",priceList);
        return "main :: priceTable";
    }

}
