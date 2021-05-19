# cgv
Book ticket cgv

# Ứng dụng đặt vé xem phim CGV

## Các model
1. Film: một phim cụ thể ví dụ "Bố Già", "Gorilla vs Kong".
2. Cinema: một rạp chiếu phim ở một địa điểm cụ thể. Vd: rạp CGV VinCom Bà Triệu.
3. Room: một phòng chiếu được đánh số nằm trong một Cinema.
4. Event: một sự kiện chiếu phim liên quan đến rạp Cinema, Room, Film, trong ngày nào, từ mấy giờ đến mấy giờ.
5. Seat: một chỗ ngồi được đánh số trong phòng chiếu.
6. Ticket: một vé ứng với một sự kiện chiếu phim Event, được mua bởi một Customer, với giá X.
7. Reservation: một lệnh giữ chỗ một Seat trong một Event. Reservation chỉ có hiệu lực trong 5 phút. Nếu không được đặt mua thành công, Reservation sẽ bị huỷ bỏ.
8. Order: một đơn hàng được tạo ra bởi một Customer. Có thể mua một hay nhiều vé trong một hay nhiều Event chiếu film.
9. OrderLine: một dòng trong đơn hàng ứng với một ticket cho một Seat trong một Event.
10. Customer: khách hàng mua vé. Có khách mua lần đầu và có khách VIP đăng ký mua thường xuyên được tích điểm và giảm giá.
11. Staff: nhân viên phục vụ cho rạp chiếu phim. Một nhân viên có thể nhận làm một đến vài role (trách nhiệm) ví dụ: bán vé, soát vé, bảo vệ, lên lịch chiếu, dọn dẹp..
