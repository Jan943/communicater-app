package app;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MobilePhoneApi {
    private List<MobilePhone> mobilePhones;

    public MobilePhoneApi() {
        MobilePhone mobilePhone1 = new MobilePhone(1,"Android",100,2010);
        MobilePhone mobilePhone2 = new MobilePhone(2,"iOS",200,2017);
        mobilePhones = new ArrayList<>();
        mobilePhones.add(mobilePhone1);
        mobilePhones.add(mobilePhone2);
    }

    @PostMapping("/api/mobiles")
    public void addMobilePhone(@RequestBody MobilePhone mobilePhone) {
        mobilePhones.add(mobilePhone);
    }


    @GetMapping("/api/mobiles")
    public List<MobilePhone> getMobilePhone() {
        return mobilePhones;
    }

    @DeleteMapping("/api/mobiles")
    public boolean removeMobilePhone(@RequestParam long id) {
        Optional<MobilePhone> first = mobilePhones.stream().filter(x -> x.getId() == id).findFirst();
        if(first.isPresent()){
            return mobilePhones.remove(first.get());
        }
        return false;
    }
}
