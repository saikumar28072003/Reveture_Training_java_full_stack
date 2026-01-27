
      // LOGIN: show password toggle
      document
        .getElementById("showLoginPass")
        .addEventListener("change", (e) => {
          document.getElementById("loginPassword").type = e.target.checked
            ? "text"
            : "password";
        });

      // REG: show password toggle
      document.getElementById("showRegPass").addEventListener("change", (e) => {
        document.getElementById("newPassword").type = e.target.checked
          ? "text"
          : "password";
      });

      // Range -> output
      const exp = document.getElementById("exp");
      const expOut = document.getElementById("expOut");
      exp.addEventListener("input", () => (expOut.value = exp.value));

      // Password meter scoring (simple demo scoring)
      const pass = document.getElementById("newPassword");
      const meter = document.getElementById("passMeter");
      const score = document.getElementById("passScore");
      const passText = document.getElementById("passText");

      function calcScore(p) {
        let s = 0;
        if (p.length >= 8) s += 35;
        if (/[0-9]/.test(p)) s += 20;
        if (/[A-Z]/.test(p)) s += 20;
        if (/[^A-Za-z0-9]/.test(p)) s += 25;
        return Math.min(100, s);
      }

      pass.addEventListener("input", () => {
        const s = calcScore(pass.value);
        meter.value = s;
        score.value = s;

        passText.className = "validHint " + (s >= 70 ? "ok" : "bad");
        passText.textContent =
          "Score: " + s + "/100 " + (s >= 70 ? "(Strong)" : "(Weak)");
      });

      // Profile progress (demo)
      const prog = document.getElementById("profileProg");
      const progOut = document.getElementById("progOut");

      function updateProgress() {
        let v = 0;
        if (document.getElementById("fullName").value.trim().length >= 3)
          v += 20;
        if (document.getElementById("regEmail").value.trim()) v += 20;
        if (document.getElementById("newPassword").value.trim().length >= 8)
          v += 20;
        if (document.getElementById("role").value) v += 20;
        if (document.getElementById("phone").value.trim()) v += 20;
        prog.value = v;
        progOut.value = v;
      }

      ["fullName", "regEmail", "newPassword", "role", "phone"].forEach((id) => {
        document.getElementById(id).addEventListener("input", updateProgress);
        document.getElementById(id).addEventListener("change", updateProgress);
      });

      // Fill sample data button (for classroom demo)
      document.getElementById("fillSample").addEventListener("click", () => {
        document.getElementById("fullName").value = "Gopi Suresh";
        document.getElementById("phone").value = "9876543210";
        document.getElementById("dob").value = "1996-06-15";
        document.getElementById("regEmail").value = "gopi@example.com";
        document.getElementById("newPassword").value = "Gopi@2025";
        document.getElementById("role").value = "developer";
        document.getElementById("city").value = "Chennai";
      });