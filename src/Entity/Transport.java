package Entity;
import javax.persistence.Entity;
import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

@Entity

public class Transport implements Serializable {
    private String bienSoXe;
    private String loaiXe;
    private LocalDateTime enterTime;
    private LocalDateTime exitTime;

    public Transport() {

    }

    public Transport(String bienSoXe, String loaiXe, LocalDateTime enterTime) {
        this.bienSoXe = bienSoXe;
        this.loaiXe = loaiXe;
        this.enterTime = enterTime;
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) {
        this.bienSoXe = bienSoXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public LocalDateTime getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(LocalDateTime enterTime) {
        // TODO: VAT truyền vào thời gian vào thực với giời gian hiện tại

        this.enterTime = enterTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        // TODO: VAT truyền vào thời gian ra thực với giời gian hiện tại

        this.exitTime = exitTime;
    }

    public void parkingFeeCalculator() {
        Duration duration = Duration.between(enterTime, exitTime);
        long minutes = duration.toMinutes();
        // TODO: VAT xử lý với lượng thời gian => tiền vé
    }
}



