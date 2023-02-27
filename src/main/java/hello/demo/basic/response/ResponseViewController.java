package hello.demo.basic.response;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {
    @RequestMapping("/response-view-v1")
    public ModelAndView responseV1(){
        ModelAndView mav= new ModelAndView("response/hello")
                .addObject("data","hello");

        return mav;
    }
    @RequestMapping("/response-view-v2")
    public String responseV2(Model model){
        model.addAttribute("data","hello!!");
        return "response/hello";//@ResponseBody를 붙이면 리턴값 그래로 나가버림.(조심조심..)
    }
    @RequestMapping("/response/hello")//바로 뷰의 이름을 반환-> 하지만 추천 방식은 아님!!
    public void responseV3(Model model){
        model.addAttribute("data","hello!!");
    }
}
